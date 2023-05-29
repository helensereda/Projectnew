package Exceptions;
import java.util.Scanner;

public class CheckUser {
    public static void main(String[] args) {
        System.out.println("Please, enter your login");
        String login = enter().nextLine();

        System.out.println("Please, enter your password ");
        String password = enter().nextLine();

        System.out.println("Please, confirm your password ");
        String confirmPassword = enter().nextLine();

        boolean result = correctInformation(login, password, confirmPassword);
        System.out.println(result);
    }

    public static Scanner enter() {
        return new Scanner(System.in);
    }

    public static boolean correctInformation(String login, String password, String confirmPassword) {
        try {
            return validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e);
            return false;
        }
//        return true;
    }

    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login format");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches("^[a-zA-Z0-9_.-]*$")) { // не знаю какой правильно выбрать regex для ввода цифр?????
            throw new WrongPasswordException("Wrong password format");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords don't match");
        }
        return true;
    }
}











