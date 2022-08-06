package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
       /* List<Integer> nums = Arrays.asList(1,5,7,4);
        multiplyNumbers(nums);
        List<Integer> ages = new ArrayList<>();
        storeAges(ages);*/

    }
    public static List<Number> multiplyNumbers(List<Number> nums){
      return nums.stream()
                .map(n -> n.intValue() * 2)
                .collect(Collectors.toList());
    }
    public static List<Number> storeAges(List<Number> nums){
        IntStream.rangeClosed(1,10)
                .forEach(nums::add);
        return nums;
    }

}
