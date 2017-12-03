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

    public BiwengerApiContext buildValidContext() throws InvalidLoginException {
        return new BiwengerApiContext(validLogin());
    }

    public BiwengerApiContext buildInvalidContext() throws InvalidLoginException {
        return new BiwengerApiContext(invalidLogin());
    }
}
