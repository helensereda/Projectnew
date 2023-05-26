package Firma;

public class Director implements People {
    String positionName = "Director";

    @Override
    public void getPosition() {
        System.out.println("Name of position is: " + positionName);

    }

}
