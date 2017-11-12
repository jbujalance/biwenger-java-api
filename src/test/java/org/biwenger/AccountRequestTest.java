package org.biwenger;

import org.biwenger.context.BiwengerApi;
import org.biwenger.context.BiwengerApiContext;
import org.biwenger.response.account.AccountResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AccountRequestTest extends ContextTestHelper {

    private final BiwengerApiContext validContext = buildValidContext();

    @Test
    public void validAccountRequest() {
        AccountResponse accountResponse = BiwengerApi.newAccountRequest(validContext).await();
        assertNotNull(accountResponse);
    }
}
