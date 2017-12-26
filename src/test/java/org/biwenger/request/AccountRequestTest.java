package org.biwenger.request;

import org.biwenger.context.BiwengerApi;
import org.biwenger.context.BiwengerApiContext;
import org.biwenger.exception.InvalidLoginException;
import org.biwenger.helper.ContextTestHelper;
import org.biwenger.response.account.AccountResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AccountRequestTest extends ContextTestHelper {

    private final BiwengerApiContext validContext = validContext();

    public AccountRequestTest() throws InvalidLoginException {
    }

    @Test
    public void validAccountRequest() {
        AccountResponse accountResponse = BiwengerApi.newAccountRequest(validContext).await();
        assertNotNull(accountResponse);
    }
}
