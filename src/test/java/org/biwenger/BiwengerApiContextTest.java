package org.biwenger;

import org.biwenger.context.BiwengerApiContext;
import org.biwenger.entity.Login;
import org.biwenger.exception.InvalidLoginException;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BiwengerApiContextTest extends ContextTestHelper {

    @Test
    public void validLoginTest() throws InvalidLoginException {
        // GIVEN a valid login
        Login login = validLogin();

        // WHEN a context is created using this login
        BiwengerApiContext context = new BiwengerApiContext(login);

        // THEN the login is successfully logged
        assertTrue(login.isLogged());
    }

    @Test(expected = InvalidLoginException.class)
    public void invalidLoginTest() throws InvalidLoginException {
        // GIVEN an invalid login
        Login login = invalidLogin();

        // THEN fails WHEN a context is created using this login
        BiwengerApiContext context = new BiwengerApiContext(login);
    }

}
