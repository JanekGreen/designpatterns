package decorator;

import decorator.coffee.BlackCoffee;
import decorator.coffee.Coffee;
import decorator.coffee.CoffeeMilkDecorator;

public class Main {
    public static void main(String[] args) {
        /*kiedy chcemy dodać funkcjonalność do instniejącej klasy nie zmianiając bazowego zachowania*/
        Coffee coffee = new BlackCoffee();
        coffee.make();
        Coffee milk = new CoffeeMilkDecorator(coffee);
        System.out.println(milk.make());
        //CoffeeSugarDecorator

        //Robimy od zera dekorator dla aparatu (klasa PhotoCamera), który będzie dodawał filtry po zrobieniu zdjęcia np: czarobiały.
        //BlackAndWhitePhotoDecorator



    }
}
