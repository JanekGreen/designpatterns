package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();
        coffee.make();
        Coffee milk = new CoffeeMilkDecorator(coffee);
        System.out.println(milk.make());

    }
}
