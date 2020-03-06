package Sumin.lesson8;

public class Programmer extends Worker implements Programmeble{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void CanProgramm() {
        System.out.println("Programming");
    }
}
