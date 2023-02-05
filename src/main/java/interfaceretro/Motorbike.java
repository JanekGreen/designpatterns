package interfaceretro;

public class Motorbike implements VehicleInterface{
    @Override
    public void changeOil() {
        System.out.println("Changing oil in motorbike");
    }

    @Override
    public boolean checkup() {
        return true;
    }
}
