package Liskov.bad;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*dwa typy dziedziczące po klasie Animal*/
        List<Animal> animals = Arrays.asList(new Bird(), new Dog());
        for (Animal a : animals){
            a.eat();
            a.walk();
            a.fly();
        }

    }


}
