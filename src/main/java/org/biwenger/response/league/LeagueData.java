package org.biwenger.response.league;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.biwenger.entity.League;
import org.biwenger.response.AbstractData;

public class LeagueData extends AbstractData {

    @JsonUnwrapped
    private League league;

    public League getLeague() {
        return league;
    }

    public void setLeague(League pLeague) {
        league = pLeague;
    }
}
