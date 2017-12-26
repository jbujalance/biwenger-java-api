package org.biwenger.request;

import org.biwenger.context.BiwengerApi;
import org.biwenger.context.BiwengerApiContext;
import org.biwenger.exception.BiwengerRestException;
import org.biwenger.exception.InvalidLoginException;
import org.biwenger.helper.ContextTestHelper;
import org.biwenger.response.league.LeagueResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LeagueRequestTest extends ContextTestHelper {

    private final BiwengerApiContext context = buildValidContextWithLeagueHeader(569297);

    public LeagueRequestTest() throws InvalidLoginException {
    }

    @Test
    public void validLeagueRequest() {
        LeagueResponse leagueResponse = BiwengerApi.newLeagueRequest(context).await();
        assertNotNull(leagueResponse);
    }

    @Test(expected = BiwengerRestException.class)
    public void invalidLeagueId() throws InvalidLoginException {
        BiwengerApi.newLeagueRequest(buildValidContextWithLeagueHeader(12345)).await();
    }
}
