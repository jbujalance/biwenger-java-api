package org.biwenger;

import org.biwenger.context.BiwengerApiContext;
import org.biwenger.context.BiwengerRestException;
import org.biwenger.entity.Login;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BiwengerApiContextTest {

    @Test
    public void validLoginTest() {
        // GIVEN a valid login
        Login login = new Login("joseab56@gmail.com", "rExCFvNr8qvNyPdHqF3w");

        // WHEN a context is created using this login
        BiwengerApiContext context = new BiwengerApiContext(login);

        // THEN the login is succesfully logged
        assertTrue(login.isLogged());
    }

    @Test(expected = BiwengerRestException.class)
    public void invalidLoginTest() {
        // GIVEN an invalid login
        Login login = new Login("invalidName", "invalidPassword");

        // THEN fails WHEN a context is created using this login
        BiwengerApiContext context = new BiwengerApiContext(login);
    }

}
