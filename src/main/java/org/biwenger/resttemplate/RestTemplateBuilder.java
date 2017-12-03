package org.biwenger.resttemplate;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestTemplateBuilder {

    private RestTemplate restTemplate = new RestTemplate();

    public RestTemplateBuilder withClientHttpRequestFactory(ClientHttpRequestFactory pRequestFactory) {
        restTemplate.setRequestFactory(pRequestFactory);
        return this;
    }

    public RestTemplateBuilder withClientHttpRequestInterceptors(ClientHttpRequestInterceptor... pRequestInterceptor) {
        restTemplate.getInterceptors().addAll(Arrays.asList(pRequestInterceptor));
        return this;
    }

    public RestTemplateBuilder withResponseErrorHandler(ResponseErrorHandler pErrorHandler) {
        restTemplate.setErrorHandler(pErrorHandler);
        return this;
    }

    public RestTemplateBuilder withHttpMessageConverters(HttpMessageConverter<?>... pMessageConverters) {
        restTemplate.getMessageConverters().addAll(Arrays.asList(pMessageConverters));
        return this;
    }

    public RestTemplateBuilder withJacksonObjectMapper(ObjectMapper pMapper) {
        MappingJackson2HttpMessageConverter messageConverter = restTemplate.getMessageConverters().stream()
                .filter(MappingJackson2HttpMessageConverter.class::isInstance)
                .map(MappingJackson2HttpMessageConverter.class::cast)
                .findFirst().orElseThrow( () -> new RuntimeException("MappingJackson2HttpMessageConverter not found"));
        messageConverter.setObjectMapper(pMapper);
        return this;
    }

    /**
     * Adds a mapping module to the default MappingJackson2HttpMessageConverter of the RestTemplate
     * @param pModule module to add to the default MappingJackson2HttpMessageConverter
     * @return this builder to chain methods
     */
    public RestTemplateBuilder withObjectMapperModule(Module pModule) {
        MappingJackson2HttpMessageConverter messageConverter = restTemplate.getMessageConverters().stream()
                .filter(MappingJackson2HttpMessageConverter.class::isInstance)
                .map(MappingJackson2HttpMessageConverter.class::cast)
                .findFirst().orElseThrow( () -> new RuntimeException("MappingJackson2HttpMessageConverter not found"));
        messageConverter.getObjectMapper().registerModule(pModule);
        return this;
    }

    public RestTemplate build() {
        return restTemplate;
    }
}
