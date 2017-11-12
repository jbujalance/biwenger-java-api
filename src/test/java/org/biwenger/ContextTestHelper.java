package org.biwenger;

import org.biwenger.context.BiwengerApiContext;
import org.biwenger.entity.Login;

public abstract class ContextTestHelper {

    public Login validLogin() {
        return new Login("test@tinoza.org", "testaccount");
    }

    public Login invalidLogin() {
        return new Login("invalidEmail", "invalidPassword");
    }

    public BiwengerApiContext buildContext(Login pLogin) {
        return new BiwengerApiContext(pLogin);
    }

    public BiwengerApiContext buildValidContext() {
        return new BiwengerApiContext(validLogin());
    }

    public BiwengerApiContext buildInvalidContext() {
        return new BiwengerApiContext(invalidLogin());
    }
}
