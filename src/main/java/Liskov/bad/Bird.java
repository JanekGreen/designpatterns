package Liskov.bad;

public class Bird extends Animal {
    @Override
    protected void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    protected void walk() {
        System.out.println("Bird is walking");

    }

    @Override
    protected void fly() {
        System.out.println("Frrrruuuu");

    }
}
