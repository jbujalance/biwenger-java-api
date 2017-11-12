package org.biwenger.request;

import org.biwenger.context.BiwengerApiContext;
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
        //TODO import url from config
        LOGGER.debug("Processing account request...");
        AccountResponse response = context.getRestTemplate().getForObject("https://biwenger.as.com/api/v1/account", AccountResponse.class);
        LOGGER.info("The user '" + context.getLoginEmail() + "' requested account information");
        return response;
    }
}
