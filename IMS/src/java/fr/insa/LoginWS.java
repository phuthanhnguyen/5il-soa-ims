package fr.insa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "LoginWS")
public class LoginWS {

    @WebMethod(operationName = "login")
    public Boolean login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        return (username.equals("pablo") && password.equals("hola1234"));
    }
}
