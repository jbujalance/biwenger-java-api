package org.biwenger.context;

import org.biwenger.request.AccountRequest;
import org.biwenger.request.LeagueRequest;

public class BiwengerApi {


    //TODO methods for creation of the different requests
    public static AccountRequest newAccountRequest(final BiwengerApiContext pContext) {
        return new AccountRequest(pContext);
    }

    public static LeagueRequest newLeagueRequest(final BiwengerApiContext pContext) {
        return new LeagueRequest(pContext);
    }
}
