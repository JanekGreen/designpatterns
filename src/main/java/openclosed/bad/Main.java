package openclosed.bad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>(Arrays.asList(new Rectangle(2, 3), new Rectangle(2, 3)));
        AreaCalculator ac = new AreaCalculator();
        double result = ac.calculate(rectangles);
        System.out.println(result);
    }
}
