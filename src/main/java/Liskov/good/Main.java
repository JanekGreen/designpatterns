package Liskov.good;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();
        List<Animal> animals = Arrays.asList(bird, dog);
        for (Animal a : animals){
            a.eat();
        }
        List<Animal> animals1 = animals.stream()
                .filter(a -> a instanceof Flyable)
                .collect(Collectors.toList());

        List<Flyable> birds = Arrays.asList(bird);
        birds.forEach(Flyable::fly);
        List<Walkable> walkables = Arrays.asList(bird, dog);
        walkables.stream()
                .forEach(Walkable::walk);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Piotr");
        map.put(2, "Ewelina");
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        List<String> userNamesByMap = userNamesByMap(map);
        treeMap.put(1, "Piotr");
        treeMap.put(2, "Ewelina");
        userNamesByMap(treeMap);

    }
    public static List<String> userNamesByMap(Map<Integer, String> map){
        return new ArrayList<>( map.values());
    }
}
