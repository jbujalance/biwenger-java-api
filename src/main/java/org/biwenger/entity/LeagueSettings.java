package org.biwenger.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeagueSettings {
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("privacy")
    private String privacy;
    @JsonProperty("onlyAdminNews")
    private int onlyAdminNews;
    @JsonProperty("cancellationClause")
    private int cancellationClause;
    @JsonProperty("immediateSales")
    private int immediateSales;
    @JsonProperty("jackpot")
    private int jackpot;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("userOffers")
    private String userOffers;
    @JsonProperty("loans")
    private String loans;
    @JsonProperty("loansMinRounds")
    private int loansMinRounds;
    @JsonProperty("challengesAllow")
    private int challengesAllow;
    @JsonProperty("roundDelayed")
    private String roundDelayed;
    @JsonProperty("lineupAllowExtra")
    private boolean lineupAllowExtra;
    @JsonProperty("lineupReserves")
    private boolean lineupReserves;
    @JsonProperty("favoritesAllow")
    private boolean favoritesAllow;

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

    public int getOnlyAdminNews() {
        return onlyAdminNews;
    }

    public void setOnlyAdminNews(int pOnlyAdminNews) {
        onlyAdminNews = pOnlyAdminNews;
    }

    public int getCancellationClause() {
        return cancellationClause;
    }

    public void setCancellationClause(int pCancellationClause) {
        cancellationClause = pCancellationClause;
    }

    public int getImmediateSales() {
        return immediateSales;
    }

    public void setImmediateSales(int pImmediateSales) {
        immediateSales = pImmediateSales;
    }

    public int getJackpot() {
        return jackpot;
    }

    public void setJackpot(int pJackpot) {
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

    public int getLoansMinRounds() {
        return loansMinRounds;
    }

    public void setLoansMinRounds(int pLoansMinRounds) {
        loansMinRounds = pLoansMinRounds;
    }

    public int getChallengesAllow() {
        return challengesAllow;
    }

    public void setChallengesAllow(int pChallengesAllow) {
        challengesAllow = pChallengesAllow;
    }

    public String getRoundDelayed() {
        return roundDelayed;
    }

    public void setRoundDelayed(String pRoundDelayed) {
        roundDelayed = pRoundDelayed;
    }

    public boolean isLineupAllowExtra() {
        return lineupAllowExtra;
    }

    public void setLineupAllowExtra(boolean pLineupAllowExtra) {
        lineupAllowExtra = pLineupAllowExtra;
    }

    public boolean isLineupReserves() {
        return lineupReserves;
    }

    public void setLineupReserves(boolean pLineupReserves) {
        lineupReserves = pLineupReserves;
    }

    public boolean isFavoritesAllow() {
        return favoritesAllow;
    }

    public void setFavoritesAllow(boolean pFavoritesAllow) {
        favoritesAllow = pFavoritesAllow;
    }
}
