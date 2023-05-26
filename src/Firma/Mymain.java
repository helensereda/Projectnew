package Firma;

public class Mymain {
    public static void main(String[] args) {
        People director = new Director ();
        People worker = new Worker();
        People accauntant = new Accauntant();

        director.getPosition();
        worker.getPosition();
        accauntant.getPosition();

    }
}
