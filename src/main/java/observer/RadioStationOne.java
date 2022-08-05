package observer;

public class RadioStationOne implements Observer{

    @Override
    public String getName() {
        return "Radio Station One";
    }

    @Override
    public void update(String data) {
        System.out.println("Breaking news on Radio one "+ data);
    }

}
