package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class League {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("created")
    private LocalDateTime created;
    @JsonProperty("scoreID")
    private int scoreID;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("user")
    private User user;
    @JsonProperty("competition")
    private String competition;
    @JsonProperty("settings")
    private LeagueSettings settings;

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getType() {
        return type;
    }

    public void setType(String pType) {
        type = pType;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String pMode) {
        mode = pMode;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime pCreated) {
        created = pCreated;
    }

    public int getScoreID() {
        return scoreID;
    }

    public void setScoreID(int pScoreID) {
        scoreID = pScoreID;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String pIcon) {
        icon = pIcon;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User pUser) {
        user = pUser;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String pCompetition) {
        competition = pCompetition;
    }

    public LeagueSettings getSettings() {
        return settings;
    }

    public void setSettings(LeagueSettings pSettings) {
        settings = pSettings;
    }
}
