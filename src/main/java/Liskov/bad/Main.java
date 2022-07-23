package Liskov.bad;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Bird(), new Dog());
        for (Animal a : animals){
            a.eat();
            a.walk();
            a.fly();
        }
    }
}
