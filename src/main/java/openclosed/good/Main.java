package openclosed.good;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Rectangle(1,2), new Circle(1.2), new Square(2.0));
        AreaCalculator areaCalculator = new AreaCalculator();
        double calculate = areaCalculator.calculate(shapeList);


    }
}
