package org.biwenger.response.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.biwenger.entity.Account;
import org.biwenger.entity.League;
import org.biwenger.response.AbstractData;

import java.util.List;

public class AccountData extends AbstractData {

    @JsonProperty("account")
    private Account account;
    @JsonProperty("leagues")
    private List<League> leagues;
    @JsonProperty("version")
    private int version;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account pAccount) {
        account = pAccount;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<League> pLeagues) {
        leagues = pLeagues;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int pVersion) {
        version = pVersion;
    }
}
