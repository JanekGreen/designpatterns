package decorator;

public class BlackCoffee implements Coffee{

    @Override
    public String make() {
        return "Black coffee";
    }

}
