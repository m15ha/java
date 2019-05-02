package employee;

public class Cook extends Employee implements Cookeble{
    public Cook(String name) {
        super(name);
    }
    @Override
    public void cook() {
        System.out.println("Cooking");
    }
}
