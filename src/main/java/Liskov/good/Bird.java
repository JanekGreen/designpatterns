package Liskov.good;

public class Bird extends Animal implements Flyable{
    @Override
    protected void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    protected void walk() {
        System.out.println("Bird is walking");

    }

    @Override
    public void fly() {
        System.out.println("Fruuuu");
    }
}
