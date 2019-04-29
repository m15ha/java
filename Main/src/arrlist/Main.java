package arrlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ivan");
        employees.add("Ivan2");
        employees.add("Ivan3");
        employees.add("Ivan4");
        employees.add("Ivan5");

        ArrayList<Integer> numberz = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numberz.add(i);
        }
        ArrayList<String> allz = new ArrayList<>();
        for (int i = 0; i < numberz.size(); i++){
        String s = numberz.get(i) + employees.get(i);
        allz.get(s);
        for (String zz : allz
             ){
            System.out.println(zz);
        }
    }
}
