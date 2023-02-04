package dependencyinversion.good.impl;

import dependencyinversion.good.Customer;
import dependencyinversion.good.Searchable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileSource implements Searchable {


    @Override
    public List<Customer> findAll() {
        //logika zwraca wszystkich z pliku
        return new ArrayList<>();
    }

    @Override
    public Optional<Customer> findById(int id) {
        // szuka w pliku Customera po id
        return Optional.empty();
    }
}
