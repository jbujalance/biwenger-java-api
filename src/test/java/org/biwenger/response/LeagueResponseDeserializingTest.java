package org.biwenger.response;

import org.biwenger.helper.DeserializingTestHelper;
import org.biwenger.response.league.LeagueResponse;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class LeagueResponseDeserializingTest extends DeserializingTestHelper {

    @Test
    public void deserializeJsonResponse() throws IOException {
        // GIVEN an account Json response
        File jsonResponse = loadFileFromTestResources("league_response.json");

        // WHEN deserializing the Json into an AccountResponse
        LeagueResponse leagueResponse = objectMapper.readValue(jsonResponse, LeagueResponse.class);

        // THEN the AccountResponse is correctly built
        Assert.assertNotNull(leagueResponse);
    }
}
