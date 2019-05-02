package employee;

public class Driver extends Employee implements Drivable{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Driving");
    }
}
