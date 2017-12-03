package org.biwenger.response.account;

import org.biwenger.helper.DeserializingTestHelper;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AccountResponseDeserializingTest extends DeserializingTestHelper {

    @Test
    public void deserializeJsonResponse() throws IOException {
        // GIVEN an account Json response
        File jsonResponse = loadFileFromTestResources("account_response.json");

        // WHEN deserializing the Json into an AccountResponse
        AccountResponse accountResponse = objectMapper.readValue(jsonResponse, AccountResponse.class);

        // THEN the AccountResponse is correctly built
        Assert.assertNotNull(accountResponse);
    }
}
