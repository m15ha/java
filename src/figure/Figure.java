package figure;

public abstract class Figure {
    private double a;
    private double b;

    public Figure(){
        this.a = 0;
        this.b = 0;
    }

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public abstract double area();


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
