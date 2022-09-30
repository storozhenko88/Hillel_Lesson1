package lesson6;

public class Car {

    public void start(){

        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("start electricity!");
    }

    private void startCommand(){
        System.out.println("start command!");
    }

    private void startFuelSystem(){
        System.out.println("start fuelSystem!");
    }
}
