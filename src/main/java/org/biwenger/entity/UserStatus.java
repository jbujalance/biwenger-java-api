package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserStatus {
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("balance")
    private Integer balance;
    @JsonProperty("offers")
    private Integer offers;
    @JsonProperty("bids")
    private Integer bids;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer pPoints) {
        points = pPoints;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer pBalance) {
        balance = pBalance;
    }

    public Integer getOffers() {
        return offers;
    }

    public void setOffers(Integer pOffers) {
        offers = pOffers;
    }

    public Integer getBids() {
        return bids;
    }

    public void setBids(Integer pBids) {
        bids = pBids;
    }
}
