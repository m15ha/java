package employee;

public class Programer extends Employee implements Programable {
    public Programer(String name) {
        super(name);
    }
    @Override
    public void codez() {
        System.out.println("Koding");
    }
}
