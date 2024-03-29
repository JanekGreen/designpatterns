package decorator.coffee;

public class CoffeeSugarDecorator extends CoffeeDecorator{

    public CoffeeSugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String make() {
        return "sugar and "+ super.make();
    }
}
