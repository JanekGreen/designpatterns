package builder;

public class ShapeData {
/*
metody wytwórcze przykład
* */
    private String shapeType;
    private double width;
    private double height;
    private double radius;

    private ShapeData(double radius) {
        this.shapeType ="circle";
        this.radius = radius;
    }
    private ShapeData(double width, double height) {
        this.width =width;
        this.height = height;
        this.shapeType ="rectangle";
    }
    public static ShapeData ofCircle(double radius){
        return new ShapeData(radius);
    }
    public static ShapeData ofRectangle(double width, double height){
        return new ShapeData(width, height);
    }


}
