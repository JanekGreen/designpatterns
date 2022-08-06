package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<String> {
    List<String> people = Arrays.asList("Janek", "Czesława", "Roman", "Jadzia");

    @Override
    public Iterator<String> iterator() {
        return people.iterator();
    }

}
