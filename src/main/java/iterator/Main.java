package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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
        for (Iterator<String> it = people.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

    }
}
