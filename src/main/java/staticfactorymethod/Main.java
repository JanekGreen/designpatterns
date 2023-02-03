package staticfactorymethod;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Collections.emptyList();
        List<Integer> integers = List.of(1, 2, 3);

        //Robimy metodę wytwórczą dla klasy Banknote
        // Banknote.of("PLN", 10) powinien wyprodukować banknot 10 zlotowy
    }
}
