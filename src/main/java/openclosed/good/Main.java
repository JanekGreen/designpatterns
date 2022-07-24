package openclosed.good;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new openclosed.good.Rectangle(2, 3),
                new Rectangle(2, 3), new Circle(5.0d));
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculateArea();
        }
        System.out.println(sum);

 /*
 Przykład użycia ifPresent ze streamami, w przypadku gdy kolekcja na której operujemy będzie pusta ifPresent sie nie wykona
        shapes.stream()
                .filter(s -> s instanceof Circle)
                //pusta
                .max((s) -> 1)
                .ge
                .ifPresent(Main::processShape);*/
    }
    public static void processShape(Shape s){
        //
    }


}
