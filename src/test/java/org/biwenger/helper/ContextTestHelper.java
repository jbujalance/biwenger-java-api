package org.biwenger.helper;

import org.biwenger.context.BiwengerApiContext;
import org.biwenger.entity.Login;
import org.biwenger.exception.InvalidLoginException;

public abstract class ContextTestHelper {

    public Login validLogin() {
        return new Login("test@tinoza.org", "testaccount");
    }

    public Login invalidLogin() {
        return new Login("invalidEmail", "invalidPassword");
    }

    public BiwengerApiContext buildContext(Login pLogin) throws InvalidLoginException {
        return new BiwengerApiContext(pLogin);
    }

    public BiwengerApiContext validContext() throws InvalidLoginException {
        return new BiwengerApiContext(validLogin());
    }

    public BiwengerApiContext invalidContext() throws InvalidLoginException {
        return new BiwengerApiContext(invalidLogin());
    }

    public BiwengerApiContext buildValidContextWithLeagueHeader(int pLeagueId) throws InvalidLoginException {
        BiwengerApiContext context = validContext();
        context.setXLeagueHeader(pLeagueId);
        return context;
    }
}
