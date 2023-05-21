package ATM;

public class CreditCard {
    private double balance;
    private String cardNumber;
    private double amount;

    public double getBalance() {
        return balance;
    }
    public CreditCard() {

        this.cardNumber = "Unknown card number";

    }

    public CreditCard(double balance, String cardNumber) {
        this.balance = balance;
        this.cardNumber = cardNumber;
    }

public void putMoney(double amount)
{
    balance = balance + amount;
    System.out.println();
    System.out.print("Your balance after increase: " + this.balance);
}

    public void withdrawMoney(double amount) {
    balance = balance - amount;
        System.out.println();
        System.out.println("Your balance after withdrawal: " + this.balance);
    }

    public void getCreditCardInfo() {
        System.out.println();
        System.out.println("This credit balance is: " + this.balance);
        System.out.println("This card number is: " + this.cardNumber);
    }
}
