package org.biwenger.context;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HeaderRequestInterceptor implements ClientHttpRequestInterceptor {

    private HttpHeaders headers;

    void setHeaders(final HttpHeaders pHeaders) {
        this.headers = pHeaders;
    }

    void addHeader(final String pHeaderName, final String pHeaderValue) {
        this.headers.add(pHeaderName, pHeaderValue);
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        Set<Map.Entry<String, List<String>>> entries = this.headers.entrySet();
        for (Map.Entry<String, List<String>> entry : this.headers.entrySet()) {
            request.getHeaders().add(entry.getKey(), entry.getValue().get(0));
        }
        return execution.execute(request, body);
    }
}
