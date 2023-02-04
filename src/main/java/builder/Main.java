package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
       /*tworzenie instancji klasy która posiada wiele pól do ustawienia w konstruktorze*/
        User user = new User.UserBuilder("Ada", "Lovelace")
                .age(12)
                .address("Wrocław 12")
                .phone("0700880770")
                .build();

        Dog dog = new  Dog.DogBuilder("Burek")
                        .age(16)
                        .type("aaaa")
                        .build();

        System.out.println(dog);

    }





}
