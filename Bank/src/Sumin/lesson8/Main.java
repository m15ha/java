package Sumin.lesson8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer prog = new Programmer("Max");
        Programmer prog1 = new Programmer("Mike");
        Programmer prog2 = new Programmer("Jex");
        Driver driv = new Driver("Bob");
        Driver driv1 = new Driver("Dan");
        Cook cook = new Cook("Lera");
        Cook cook1 = new Cook("Nastia");
        ArrayList<Worker> v1 = new ArrayList<>();
        v1.add(prog);
        v1.add(prog1);
        v1.add(prog2);
        v1.add(driv);
        v1.add(driv1);
        v1.add(cook);
        v1.add(cook1);
        for (Worker i :
             v1) {
            i.voice();
        }
        ArrayList<Programmer> p1 = new ArrayList<>();
        p1.add(prog);
        p1.add(prog1);
        p1.add(prog2);
        for (Programmer pp:
             p1) {
            pp.CanProgramm();
        }
    }    
}
