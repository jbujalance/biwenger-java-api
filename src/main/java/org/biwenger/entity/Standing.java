package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class Standing {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("positionInc")
    private Integer positionInc;
    @JsonProperty("group")
    private String group;
    @JsonProperty("teamSize")
    private Integer teamSize;
    @JsonProperty("teamValue")
    private Integer teamValue;
    @JsonProperty("lastPositions")
    private List<Integer> lastPositions;
    @JsonProperty("lastAccess")
    private LocalDateTime lastAccess;
    @JsonProperty("position")
    private Integer position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer pId) {
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

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer pPoints) {
        points = pPoints;
    }

    public Integer getPositionInc() {
        return positionInc;
    }

    public void setPositionInc(Integer pPositionInc) {
        positionInc = pPositionInc;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String pGroup) {
        group = pGroup;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer pTeamSize) {
        teamSize = pTeamSize;
    }

    public Integer getTeamValue() {
        return teamValue;
    }

    public void setTeamValue(Integer pTeamValue) {
        teamValue = pTeamValue;
    }

    public List<Integer> getLastPositions() {
        return lastPositions;
    }

    public void setLastPositions(List<Integer> pLastPositions) {
        lastPositions = pLastPositions;
    }

    public LocalDateTime getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(LocalDateTime pLastAccess) {
        lastAccess = pLastAccess;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer pPosition) {
        position = pPosition;
    }
}
