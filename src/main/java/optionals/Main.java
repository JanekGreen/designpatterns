package optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> nameOpt = Optional.ofNullable("Janek");
        String result = nameOpt
                .map(s -> s.toUpperCase(Locale.ROOT))
                .map(s -> s.substring(2))
                .orElse("default");
      /*  String name = computer.flatMap(c -> c.getSoundCard())
                .flatMap(s -> s.getUSB())
                .map(u -> u.getVersion())
                .orElse("UNKNOWN");*/
        /*uwaga na optional.get() gdy mamy null w środku dostajemy wyjątek*/
     /*   Optional<String> nameOpt2 = Optional.ofNullable(null);
        nameOpt2.get();*/
        /*optional of wywali się z wyjątkiem gdy przekażemy tam nulla*/
      /*  Optional.of(null);*/
        List<Optional<String>> stringOptionals = new ArrayList<>();


        System.out.println(result);

    }
}
