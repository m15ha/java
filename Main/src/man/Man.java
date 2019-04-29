package man;

public class Man {
    private String name;
    private String positions;
//    private int age;
//    private double height;

    public Man(String name, String positions) {
        this.name = name;
        this.positions = positions;
//        this.age = age;
//        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getPositions() {
        return positions;
    }
}
