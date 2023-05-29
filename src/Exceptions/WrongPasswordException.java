package Exceptions;

    public class WrongPasswordException extends Exception {
        public WrongPasswordException ()
        {
            super("login must meet the requirements");
        }
        public WrongPasswordException (String message)
        {
            super(message);
        }

    }

