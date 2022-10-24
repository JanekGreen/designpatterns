package abstractfactory.packages;

public class AirPackage implements Package{
    @Override
    public void send() {
        System.out.println("send by air");
    }
}
