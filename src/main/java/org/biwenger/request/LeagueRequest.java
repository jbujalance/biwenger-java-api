package org.biwenger.request;

import org.biwenger.context.BiwengerApiContext;
import org.biwenger.context.BiwengerUrls;
import org.biwenger.response.league.LeagueResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeagueRequest implements IRequest<LeagueResponse> {

    private final BiwengerApiContext context;
    private static Logger LOGGER = LoggerFactory.getLogger(LeagueRequest.class);

    public LeagueRequest(final BiwengerApiContext pContext) {
        this.context = pContext;
    }

    @Override
    public LeagueResponse await() {
        LOGGER.debug("Sending league request...");
        LeagueResponse response = context.getRestTemplate().getForObject(BiwengerUrls.LEAGUE_URL, LeagueResponse.class);
        LOGGER.info("The user '" + context.getLoginEmail() + "' requested league information for the league id : " + response.getData().getLeague().getId());
        return response;
    }
}
