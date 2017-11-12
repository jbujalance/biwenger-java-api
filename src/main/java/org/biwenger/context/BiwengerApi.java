package org.biwenger.context;

import org.biwenger.request.AccountRequest;

public class BiwengerApi {


    //TODO methods for creation of the different requests
    public static AccountRequest newAccountRequest(final BiwengerApiContext pContext) {
        return new AccountRequest(pContext);
    }
}
