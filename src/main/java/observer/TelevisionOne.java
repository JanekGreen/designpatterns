package observer;

public class TelevisionOne implements Observer{

    @Override
    public String getName() {
        return "Television One";
    }

    @Override
    public void update(String data) {
        System.out.println("***Television one Breaking news "+ data);
    }

}
