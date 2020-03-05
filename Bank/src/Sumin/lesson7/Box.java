package Sumin.lesson7;

public class Box {
    private int lenght;
    private int height;

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Box(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
    }
    public void showInfo (){
        System.out.print(lenght + " " + height);
    }
}


