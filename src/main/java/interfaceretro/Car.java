package interfaceretro;

public class Car  implements VehicleInterface {
    private String model;
    private String producer;
    private int yearOfProduction;

    public void drive(){
        System.out.println("Car is driving");
    }


    @Override
    public void changeOil() {
        System.out.println("Changing oil in a car");
    }

    @Override
    public boolean checkup() {
        System.out.println("Checkup for a car");
        return false;
    }
}
