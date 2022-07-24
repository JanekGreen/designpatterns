package Liskov.good;

public class Bird extends Animal implements Flyable, Walkable{

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking");
    }

    @Override
    protected void eat() {
        System.out.println("Bird is eating");
    }

}
