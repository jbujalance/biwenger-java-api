package org.biwenger.context;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.biwenger.entity.Login;
import org.biwenger.exception.InvalidLoginException;
import org.biwenger.resttemplate.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

/**
 * The context of the API. Contains the settings to access the API such as the user credentials or the URLs.
 */
public class BiwengerApiContext {

    private Login login;
    private static RestTemplate restTemplate;
    private static HeaderRequestInterceptor headerInterceptor;
    //TODO instantiate the config files containing the URLs from the properties files injected by Spring

    public BiwengerApiContext(final Login pLogin) throws InvalidLoginException {
        this.login = pLogin;
        this.initializeHeaders();
        this.initializeRestTemplate();
        this.logInIfNecessary();
        // TODO load account headers
    }

    public RestTemplate getRestTemplate() {
        if (restTemplate == null) {
            initializeRestTemplate();
        }
        return restTemplate;
    }

    private void initializeRestTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setOutputStreaming(false);

        SimpleModule localDateTimeModule = new SimpleModule();
        localDateTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(LocalDateTime.class));

        restTemplate = new RestTemplateBuilder()
                .withClientHttpRequestFactory(requestFactory)
                .withClientHttpRequestInterceptors(headerInterceptor)
                .withResponseErrorHandler(new BiwengerResponseErrorHandler())
                .withObjectMapperModule(localDateTimeModule)
                .build();
    }

    private void initializeHeaders() {
        HttpHeaders headers = new HeadersBuilder()
                .add(HttpHeaders.CONTENT_TYPE,"application/json;charset=UTF-8")
                .add(HttpHeaders.ACCEPT, "application/json, text/plain, */*")
                .add(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br")
                .build();
        headerInterceptor = new HeaderRequestInterceptor();
        headerInterceptor.setHeaders(headers);
    }

    private void logInIfNecessary() throws InvalidLoginException {
        if (!this.login.isLogged()) {
            this.login.logInForToken(this);
        }
        headerInterceptor.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + login.getToken());
    }

    public String getLoginEmail() {
        return this.login.getEmail();
    }

}
