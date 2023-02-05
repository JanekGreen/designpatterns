package decorator;

import decorator.coffee.BlackCoffee;
import decorator.coffee.Coffee;
import decorator.coffee.CoffeeMilkDecorator;
import decorator.coffee.CoffeeSugarDecorator;

public class Main {
    public static void main(String[] args) {
        /*kiedy chcemy dodać funkcjonalność do instniejącej klasy nie zmianiając bazowego zachowania*/
        Coffee coffee = new BlackCoffee();
        System.out.println(coffee.make());
        Coffee milk = new CoffeeMilkDecorator(coffee);
        Coffee milkAndSugar = new CoffeeSugarDecorator(milk);
        System.out.println(milkAndSugar.make());
        //CoffeeSugarDecorator

        //Robimy od zera dekorator dla aparatu (klasa PhotoCamera), który będzie dodawał filtry po zrobieniu zdjęcia np: czarobiały.
        //BlackAndWhitePhotoDecorator



    }
}
