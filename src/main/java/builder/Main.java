package builder;

import staticfactorymethod.ShapeData;

import java.util.Arrays;
import java.util.List;

public class Main {

    static public int returnUserAge(){
        return 12;
    }

    public static void main(String[] args) {
        User user = new User.UserBuilder("Ada", "Lovelace")
                .age(12)
                .address("Wrocław 12")
                .phone("0700880770")
                .build();

        System.out.println(user);

        /* static factory method*/
        List<String> names = Arrays.asList("cos", "coś2", "coś3");

        Dog dog = new Dog.DogBuilder()
                .toys(Arrays.asList("cos", "coś2", "coś3"))
                .build();

    }

    ShapeData shapeData =  ShapeData.ofCircle(9d);
    ShapeData rec = ShapeData.ofRectangle(12d, 12d);




}
