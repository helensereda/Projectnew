package Phones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8029-163-12-12", "Nokia", 5.3);
        Phone phone2 = new Phone("8029-112-08-08", "Apple");
        Phone phone3 = new Phone();

        phone1.setNumber();
        phone1.setModel();
        phone1.setWeight();

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        System.out.println();


        phone1.receiveCall(" - " + "Lena");
        phone2.receiveCall(" - " + "Kate" + "(8029-512-14-58)");
        System.out.println();


        phone1.sendMessage("8029-113-13-13", "+7512-100-10-10", "+375(29)509-48-48");
        System.out.println();
        phone2.sendMessage ("8029-101-11-11");

    }
}
