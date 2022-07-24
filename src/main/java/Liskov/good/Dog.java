package Liskov.good;

public class Dog extends Animal implements Walkable{

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    protected void eat() {
        System.out.println("Dog is eating");

    }

}
