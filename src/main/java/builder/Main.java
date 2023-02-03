package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        User user = new User.UserBuilder("Ada", "Lovelace")
                .age(12)
                .address("Wrocław 12")
                .phone("0700880770")
                .build();

        /*Robimy buildera dla klasy Dog*/
        System.out.println(user);

    }





}
