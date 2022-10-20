package builder;

import staticfactorymethod.ShapeData;

import java.util.ArrayList;
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
        /*Lista jest niemutowalna UnsupportedOperationException zostanie wyrzucony przy jakiejkolwiek modyfikacji*/
        List<String> names = Arrays.asList("cos", "coś2", "coś3");
        /*jak temu zaradzić: użyć Konstruktora ArrayList */
        List<String> namesMutable = new ArrayList<>(Arrays.asList("cos", "coś2", "coś3"));

        /*to się wykrzaczy*/
        //names.add("Heniu");
        namesMutable.add("Józio");

        Dog dog = new Dog.DogBuilder()
                .toys(Arrays.asList("cos", "coś2", "coś3"))
                .build();

    }

    ShapeData shapeData =  ShapeData.ofCircle(9d);
    ShapeData rec = ShapeData.ofRectangle(12d, 12d);




}
