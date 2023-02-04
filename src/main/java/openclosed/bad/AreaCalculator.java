package openclosed.bad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreaCalculator {
    /*zły przykład, aby liczyć pola okręgów (Circle) trzeba przebudować całą tą klase*/
    public double calculate(List<Rectangle> rectangles){
        double sum = 0;
        for (Rectangle s : rectangles){
            sum += s.getHeight() * s.getWidth();
        }
        return sum;
    }

}
