package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeagueSettings {
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("privacy")
    private String privacy;
    @JsonProperty("onlyAdminNews")
    private Integer onlyAdminNews;
    @JsonProperty("cancellationClause")
    private Integer cancellationClause;
    @JsonProperty("immediateSales")
    private Integer immediateSales;
    @JsonProperty("jackpot")
    private Integer jackpot;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("userOffers")
    private String userOffers;
    @JsonProperty("loans")
    private String loans;
    @JsonProperty("loansMinRounds")
    private Integer loansMinRounds;
    @JsonProperty("challengesAllow")
    private Integer challengesAllow;
    @JsonProperty("roundDelayed")
    private String roundDelayed;
    @JsonProperty("lineupAllowExtra")
    private Boolean lineupAllowExtra;
    @JsonProperty("lineupReserves")
    private Boolean lineupReserves;
    @JsonProperty("favoritesAllow")
    private Boolean favoritesAllow;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String pSecret) {
        secret = pSecret;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String pPrivacy) {
        privacy = pPrivacy;
    }

    public Integer getOnlyAdminNews() {
        return onlyAdminNews;
    }

    public void setOnlyAdminNews(Integer pOnlyAdminNews) {
        onlyAdminNews = pOnlyAdminNews;
    }

    public Integer getCancellationClause() {
        return cancellationClause;
    }

    public void setCancellationClause(Integer pCancellationClause) {
        cancellationClause = pCancellationClause;
    }

    public Integer getImmediateSales() {
        return immediateSales;
    }

    public void setImmediateSales(Integer pImmediateSales) {
        immediateSales = pImmediateSales;
    }

    public Integer getJackpot() {
        return jackpot;
    }

    public void setJackpot(Integer pJackpot) {
        jackpot = pJackpot;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String pBalance) {
        balance = pBalance;
    }

    public String getUserOffers() {
        return userOffers;
    }

    public void setUserOffers(String pUserOffers) {
        userOffers = pUserOffers;
    }

    public String getLoans() {
        return loans;
    }

    public void setLoans(String pLoans) {
        loans = pLoans;
    }

    public Integer getLoansMinRounds() {
        return loansMinRounds;
    }

    public void setLoansMinRounds(Integer pLoansMinRounds) {
        loansMinRounds = pLoansMinRounds;
    }

    public Integer getChallengesAllow() {
        return challengesAllow;
    }

    public void setChallengesAllow(Integer pChallengesAllow) {
        challengesAllow = pChallengesAllow;
    }

    public String getRoundDelayed() {
        return roundDelayed;
    }

    public void setRoundDelayed(String pRoundDelayed) {
        roundDelayed = pRoundDelayed;
    }

    public Boolean isLineupAllowExtra() {
        return lineupAllowExtra;
    }

    public void setLineupAllowExtra(Boolean pLineupAllowExtra) {
        lineupAllowExtra = pLineupAllowExtra;
    }

    public Boolean isLineupReserves() {
        return lineupReserves;
    }

    public void setLineupReserves(Boolean pLineupReserves) {
        lineupReserves = pLineupReserves;
    }

    public Boolean isFavoritesAllow() {
        return favoritesAllow;
    }

    public void setFavoritesAllow(Boolean pFavoritesAllow) {
        favoritesAllow = pFavoritesAllow;
    }
}
