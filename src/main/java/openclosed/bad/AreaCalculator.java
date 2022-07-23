package openclosed.bad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaCalculator {
    public double calculate(List<Rectangle> rectangles){
        double sum = 0;
        for (Rectangle s : rectangles){
            sum += s.getHeight() * s.getWidth();
        }
        return sum;
    }

}
