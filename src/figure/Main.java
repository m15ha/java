package figure;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(6, 7);
        Triangle triangle = new Triangle(5, 6, 7);
        double s = triangle.area();
        
        System.out.println(s);
    }
}
