import ATM.CreditCard;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main (String[] args) {
        CreditCard BTB = new CreditCard (1000, "3564-5698-1236-8569");
        CreditCard COR = new CreditCard(800,"1236-1875-5896-9632");
        CreditCard VOV = new CreditCard(500,"5963-4532-1256-1496");

        BTB.putMoney(150.2);
        COR.putMoney(150.6);

        VOV.withdrawMoney(150.6);

        BTB. getCreditCardInfo();
        COR.getCreditCardInfo();
        VOV.getCreditCardInfo();

    }
}
