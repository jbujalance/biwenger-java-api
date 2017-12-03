package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.biwenger.context.BiwengerApiContext;
import org.biwenger.context.BiwengerUrls;
import org.biwenger.exception.BiwengerRestException;
import org.biwenger.exception.InvalidLoginException;
import org.biwenger.response.login.LoginResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Login {
    @JsonProperty(value = "email", required = true)
    private String email;
    @JsonProperty(value = "password", required = true)
    private String password;
    @JsonIgnore
    private String token;
    @JsonIgnore
    private static Logger LOGGER = LoggerFactory.getLogger(Login.class);

    public Login(final String pEmail, final String pPassword) {
        this.email = pEmail;
        this.password = pPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String pPassword) {
        this.password = pPassword;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String pToken) {
        this.token = pToken;
    }

    @JsonIgnore
    public boolean isLogged() {
        return token != null;
    }

    public void logInForToken(final BiwengerApiContext pContext) throws InvalidLoginException {
        try {
            LoginResponse loginResponse = pContext.getRestTemplate().postForObject(BiwengerUrls.LOGIN_URL, this, LoginResponse.class);
            this.token = loginResponse.getToken();
            LOGGER.info("Successfully logged as '" + email + "'");
        } catch (BiwengerRestException exception) {
            throw new InvalidLoginException("Something went wrong during the login", exception);
        }
    }
}
