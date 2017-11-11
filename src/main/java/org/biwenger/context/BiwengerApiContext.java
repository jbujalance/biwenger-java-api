package org.biwenger.context;

import org.biwenger.entity.Login;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * The context of the API. Contains the settings to access the API such as the user credentials or the URLs.
 */
public class BiwengerApiContext {

    private Login login;
    private static RestTemplate restTemplate;
    private static HeaderRequestInterceptor headerInterceptor;
    //TODO instantiate the config files containing the URLs from the properties files injected by Spring

    public BiwengerApiContext(final Login pLogin) {
        this.login = pLogin;
        this.initializeHeaders();
        this.initializeRestTemplate();
        this.logInIfNecessary();
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
        restTemplate = new RestTemplate(requestFactory);
        restTemplate.setInterceptors(Collections.singletonList(headerInterceptor));
        restTemplate.setErrorHandler(new BiwengerResponseErrorHandler());
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

    private void logInIfNecessary() {
        if (!this.login.isLogged()) {
            this.login.logInForToken(this);
        }
        headerInterceptor.addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + login.getToken());
    }

}
