
public class Square {

    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }

    public double perimeter() {
        return 4 * length;
    }
}
