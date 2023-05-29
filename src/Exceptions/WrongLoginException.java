package Exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException ()
    {
        super("login must meet the requirements");
    }
    public WrongLoginException (String message)
    {
        super(message);
    }

}
