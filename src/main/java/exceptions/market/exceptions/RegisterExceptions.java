package exceptions.market.exceptions;

public class RegisterExceptions extends Exception {

    protected String message;
    protected RegisterExceptions(String message)
    {
        this.message = message;
    }
}
