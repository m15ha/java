package figure;

public class Triangle extends Figure {
    private double c;
    private double size;
    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }
public Triangle (double size){
        super(size, size);
        this.c = size;
    }
    @Override
    public double area() {
        return getA() + getB() + this.c;
    }
}
