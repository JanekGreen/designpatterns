package decorator;

public class CoffeeMilkDecorator extends CoffeeDecorator{

    public CoffeeMilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String make() {
        return super.make() + " + milk";
    }

}
