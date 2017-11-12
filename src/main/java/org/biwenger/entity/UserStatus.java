package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserStatus {
    @JsonProperty("points")
    private int points;
    @JsonProperty("balance")
    private int balance;
    @JsonProperty("offers")
    private int offers;
    @JsonProperty("bids")
    private int bids;

    public int getPoints() {
        return points;
    }

    public void setPoints(int pPoints) {
        points = pPoints;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int pBalance) {
        balance = pBalance;
    }

    public int getOffers() {
        return offers;
    }

    public void setOffers(int pOffers) {
        offers = pOffers;
    }

    public int getBids() {
        return bids;
    }

    public void setBids(int pBids) {
        bids = pBids;
    }
}
