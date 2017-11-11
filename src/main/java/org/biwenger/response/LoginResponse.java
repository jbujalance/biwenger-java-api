package org.biwenger.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {

    @JsonProperty("token")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String pToken) {
        this.token = pToken;
    }
}
