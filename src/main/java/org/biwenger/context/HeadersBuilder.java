package org.biwenger.context;

import org.springframework.http.HttpHeaders;

public class HeadersBuilder {

    private HttpHeaders headers = new HttpHeaders();

    public HeadersBuilder add(final String pHeaderName, final String pHeaderValue) {
        headers.add(pHeaderName, pHeaderValue);
        return this;
    }

    public HttpHeaders build() {
        return headers;
    }
}
