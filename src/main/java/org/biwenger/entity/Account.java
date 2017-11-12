package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

/**
 * An Account can hold several Users and Leagues, each User for a single League
 */
public class Account {
    @JsonProperty("id")
    private int id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created")
    private LocalDateTime created;
    @JsonProperty("devices")
    private List<String> devices;

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        this.id = pId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String pLocale) {
        this.locale = pLocale;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String pStatus) {
        this.status = pStatus;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime pCreated) {
        this.created = pCreated;
    }

    public List<String> getDevices() {
        return devices;
    }

    public void setDevices(List<String> pDevices) {
        this.devices = pDevices;
    }
}
