package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("group")
    private String group;
    @JsonProperty("type")
    private String type;
    @JsonProperty("status")
    private UserStatus status;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String pIcon) {
        icon = pIcon;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String pGroup) {
        group = pGroup;
    }

    public String getType() {
        return type;
    }

    public void setType(String pType) {
        type = pType;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus pStatus) {
        status = pStatus;
    }
}
