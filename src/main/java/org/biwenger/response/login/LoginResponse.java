package org.biwenger.response.login;

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
