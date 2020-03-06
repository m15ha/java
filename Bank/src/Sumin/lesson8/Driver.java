package Sumin.lesson8;

public class Driver extends Worker implements Driveble{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void CanDrive() {
        System.out.println("Driving");
    }
}
