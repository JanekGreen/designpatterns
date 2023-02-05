package interfaceretro;

public class Main {
    public static void main(String[] args) {
     changeOil(new Car());
     changeOil(new SportsCar());
     changeOil(new Motorbike());
     VehicleInterface vehicleInterface = new SportsCar();
     vehicleInterface.changeOil();
     vehicleInterface.checkup();

    }
    private static void changeOil(VehicleInterface vehicleInterface){
        vehicleInterface.changeOil();
        vehicleInterface.checkup();
    }
}
