package Liskov.good;

import Liskov.bad.Animal;

public class Dog extends Animal {

    @Override
    protected void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    protected void walk() {
        System.out.println("Dog is walking");

    }

    @Override
    protected void fly() {
        throw new UnsupportedOperationException("Dogs cannot fly");

    }

}
