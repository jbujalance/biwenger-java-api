package org.biwenger.request;

import org.biwenger.context.BiwengerApiContext;
import org.biwenger.context.BiwengerUrls;
import org.biwenger.response.account.AccountResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountRequest implements IRequest<AccountResponse> {

    private final BiwengerApiContext context;
    private static Logger LOGGER = LoggerFactory.getLogger(AccountRequest.class);

    public AccountRequest(final BiwengerApiContext pContext) {
        this.context = pContext;
    }

    @Override
    public AccountResponse await() {
        LOGGER.debug("Sending account request...");
        AccountResponse response = context.getRestTemplate().getForObject(BiwengerUrls.ACCOUNT_URL, AccountResponse.class);
        LOGGER.info("The user '" + context.getLoginEmail() + "' requested account information");
        return response;
    }
}
