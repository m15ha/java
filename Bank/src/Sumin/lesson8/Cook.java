package Sumin.lesson8;

public class Cook extends Worker implements Cooceble{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void CanCook() {
        System.out.println("Cooking");
    }
}
