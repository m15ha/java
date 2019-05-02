package employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programer programer = new Programer("Ivan");
        Programer programer2 = new Programer("Boris");
        Programer programer3 = new Programer("Mike");
        Driver driver = new Driver("Bob");
        Driver driver2 = new Driver("James");
        Cook cook = new Cook("Ana");
        ArrayList<Employee> emplyee = new ArrayList<>();
        emplyee.add(programer);
        emplyee.add(programer2);
        emplyee.add(programer3);
        emplyee.add(driver);
        emplyee.add(driver2);
        emplyee.add(cook);
        for (Employee emploeez: emplyee
             ) {
            emploeez.voice();
        }
        ArrayList<Programable> programmers = new ArrayList<>();
        programmers.add(programer);
        programmers.add(programer2);
        programmers.add(programer3);
        for (Programable prog: programmers
             ) {
            prog.codez();
        }
    }
}
