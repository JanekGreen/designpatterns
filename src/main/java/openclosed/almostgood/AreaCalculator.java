package openclosed.almostgood;

import java.util.List;

public class AreaCalculator {
    /* Rozwiązanie lepsze niż poprzenie, ale nie do końca bo w przypadku nowego rozdzaju Shape musimy modyfikować tą klase*/
    public double calculate(List<Shape> shapes){
        double sum = 0;
        for (Shape s : shapes){
            if(s instanceof Rectangle){
                //
            }else if(s instanceof Circle){
                //
            }

        }
        return sum;
    }

}
