package openclosed.good;

public class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side *side;
    }
}
