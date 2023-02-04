package openclosed.good;

import java.util.List;

public class AreaCalculator {
    // chcąc dodać nową figurę nie musimy modyfikować tej klasy
    double calculate(List<Shape> shapes){
        double sum = 0.0d;
        for (Shape s : shapes){
           sum+=s.calculateArea();
        }
        return  sum;
    }
}
