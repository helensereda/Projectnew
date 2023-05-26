package Firma;

public class Worker implements People {

    String positionName = "Worker";

    @Override
    public void getPosition() {
        System.out.println("Name of position is: " + positionName);

    }


}
