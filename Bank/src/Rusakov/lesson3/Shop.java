package Rusakov.lesson3;

public class Shop<X> {
    private X item1;

    public Shop(X item1) {
        this.item1 = item1;
    }

    public X getItem1() {
        return item1;
    }

    public void setItem1(X item1) {
        this.item1 = item1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
