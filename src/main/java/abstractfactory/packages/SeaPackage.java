package abstractfactory.packages;

public class SeaPackage implements Package{
    @Override
    public void send() {
        System.out.println("send by sea");
    }
}
