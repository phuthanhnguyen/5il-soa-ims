package fr.insa;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginWSTest {
    
    @Test
    public void testLogin() {
        String username = "pablo";
        String password = "hola1234";
        LoginWS login = new LoginWS();
        Boolean result = login.login(username, password);
        assertTrue(result);
    }
    
}
