package decorator;

public class CoffeeSugarDecorator extends CoffeeDecorator{

    public CoffeeSugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String make() {
        return super.make() + "+ Sugar";
    }

}
