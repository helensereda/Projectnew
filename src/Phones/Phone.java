package Phones;

public class Phone {

    private String number;
    private String model;
    private double weight;

    // конструктор с тремя параметрами

    public Phone (String number,String model, double weight ) {
        this (number, model);
        this.weight = weight;
    }

    // конструктор с двумя параметрами
    public Phone (String number,String model) {
        this.number = number;
        this.model = model;
    }
    // конструктор без параметров
    public Phone () {
    }

    public void setNumber() {
        this.number = number;
    }

    public String getNumber () {
        return number;
    }

    public void setModel() {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
// метод receiveCall с одним параметром
    public void receiveCall(String name) {
        System.out.println ("Calling" + name);
    }
    // метод receiveCall с двумя параметром
    public void receiveCall(String name, String number ) {
        System.out.println ("Calling" + name + " (" + number + ")");
    }

// метод sendMessage с переменной длинной аргументов
    public void sendMessage( String... numbers) {
        System.out.println ("Send message " + "to phone");
        for (String num:numbers)
        {
            System.out.println (num);
        }
    }

}
