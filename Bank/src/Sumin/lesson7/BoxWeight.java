package Sumin.lesson7;

public class BoxWeight extends Box {
    private int weight;

    public BoxWeight(int lenght, int height, int weight) {
        super(lenght, height);
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" " + weight);
    }
}
