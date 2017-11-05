package org.biwenger.context;

import java.util.HashMap;
import java.util.Map;

public class HeadersBuilder {

    private Map<String, String> headers = new HashMap<>();

    public HeadersBuilder add(final String pHeaderName, final String pHeaderValue) {
        headers.put(pHeaderName, pHeaderValue);
        return this;
    }

    public Map<String, String> build() {
        return headers;
    }
}
