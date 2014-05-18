public class Rectangle {

    private final double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }


    public double perimeter() {
        return (height + width) * 2;
    }
}
