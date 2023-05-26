package Firma;

public class Accauntant implements People {
     String positionName = "Accauntant";

    @Override
    public void getPosition() {
        System.out.println("Name of position is: " + positionName);

    }
}
