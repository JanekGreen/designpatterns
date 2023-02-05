package exercise;


import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 10;i++){
            values.add(random.nextInt(50));
            //1 2 8 8 8 9
        }
        Set<Integer> uniqueValues = new HashSet<>();
        List<Integer> duplicatedValues = new ArrayList<>();
        for (Integer value : values) {
            boolean isAdded = uniqueValues.add(value);
            if (!isAdded) {
                System.out.println("Duplicated value found "+value);
                duplicatedValues.add(value);
            }
        }
        uniqueValues.removeIf(value -> duplicatedValues.contains(value));
        System.out.println("Unique: " + uniqueValues);
        System.out.println("Duplicated: " + duplicatedValues);
    }
}