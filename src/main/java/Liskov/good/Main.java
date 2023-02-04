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
        Animal animal = new Bird();
       Flyable bird = new Bird();
       bird.fly();

    }
}
