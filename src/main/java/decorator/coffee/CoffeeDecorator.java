package decorator.coffee;

public abstract class CoffeeDecorator implements Coffee{
private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String make() {
        /*dekorator robi to samo co obiekt, który jest przekazany do konstruktora*/
       return coffee.make();
    }

}
