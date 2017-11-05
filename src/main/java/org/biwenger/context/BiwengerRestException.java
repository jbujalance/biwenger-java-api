package org.biwenger.context;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;

public class BiwengerRestException extends IOException {
    @JsonProperty("status")
    private int status;
    @JsonProperty("message")
    private String apiMessage;
    @JsonProperty("userMessage")
    private String userMessage;
    @JsonProperty("code")
    private String code;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @JsonProperty("message")
    public String getApiMessage() {
        return apiMessage;
    }

    @JsonProperty("message")
    public void setApiMessage(String apiMessage) {
        this.apiMessage = apiMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return "Status: " + status + ". Message: " + apiMessage + " (" + userMessage + "). Code: " + code;
    }
}
