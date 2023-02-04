package staticfactorymethod;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * Wzorzec static factory method
        * Statyczne metody, które zamiast konstruktorów tworzą nam obiekty
        * */
        List<Integer> integers = List.of(1, 2, 3);
        Person pawel = Person.OfName("Paweł");
        Person personOf = Person.personOf("Janek", "Kowalski");

        //Robimy metodę wytwórczą dla klasy Banknote
        Banknote pln = Banknote.of("PLN", 10);//powinien wyprodukować banknot 10 zlotowy
    }
}
