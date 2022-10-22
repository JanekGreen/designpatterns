package decorator;

import decorator.coffee.BlackCoffee;
import decorator.coffee.Coffee;
import decorator.coffee.CoffeeMilkDecorator;
import decorator.coffee.CoffeeSugarDecorator;

public class Main {
    public static void main(String[] args) {
        /*kiedy chcemy dodać funkcjonalność do instniejącej klasy nie zmianiając bazowego zachowania*/
        Coffee coffee = new BlackCoffee();
        coffee.make();
        Coffee milk = new CoffeeMilkDecorator(coffee);
        System.out.println(milk.make());
        Coffee coffeeWithSugar = new CoffeeSugarDecorator(coffee);
        System.out.println(coffeeWithSugar.make());
        Coffee coffeeWithSugarAndMilk = new CoffeeSugarDecorator(milk);
        System.out.println(coffeeWithSugarAndMilk.make());

    }
}
