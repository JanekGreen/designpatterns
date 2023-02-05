package interfaceretro;

public class SportsCar extends Car implements VehicleInterface{

    public void race(){
        System.out.println("Taking part in a race");
    }

    @Override
    public void changeOil() {
        System.out.println("Changing oil in a Sports car");
    }

    @Override
    public boolean checkup() {
        System.out.println("Checkup for sports car");
        return true;
    }
}
