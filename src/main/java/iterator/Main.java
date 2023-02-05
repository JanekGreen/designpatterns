package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*People implementuje Iterable<String> dlatego można używać pętli foreach */
        People people = new People();
        for (String p : people){
            System.out.println(p);
        }
        List<String> peopleEx = Arrays.asList("Janek", "Czesława", "Roman", "Jadzia");
        Iterator<String> iterator = peopleEx.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Iterator<String> it = people.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
        int[] numbers = {1, 2, 3, 4, 5};
        IntegerArrayIterator customIterator = new IntegerArrayIterator(numbers);

        while (customIterator.hasNext()) {
            System.out.println(customIterator.next());
        }

    }
}
