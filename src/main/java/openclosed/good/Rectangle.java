package openclosed.good;

public class Rectangle implements Shape{

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

}
