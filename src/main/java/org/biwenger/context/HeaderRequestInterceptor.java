package org.biwenger.context;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HeaderRequestInterceptor implements ClientHttpRequestInterceptor {

    private Map<String, String> headers = new HashMap<>();

    public void addHeader(final String pHeaderName, final String pHeaderValue) {
        this.headers.put(pHeaderName, pHeaderValue);
    }

    public void addHeaders(final Map<String, String> pHeaders) {
        this.headers.putAll(pHeaders);
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            request.getHeaders().add(entry.getKey(), entry.getValue());
        }
        return execution.execute(request, body);
    }
}
