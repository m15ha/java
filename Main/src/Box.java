public class Box {
    double width;
    double height;
    double length;

    void ShowVolume() {
        double result = width * height * length;
        System.out.println(result);
    }

    double volume() {
        return width * height * length;

    }
}
