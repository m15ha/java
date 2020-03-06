package Sumin.lesson5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> emloyees = new ArrayList<>();
        emloyees.add("Dave");
        emloyees.add("Mike");
        emloyees.add("Bob");
        for (int i = 0; i < emloyees.size(); i++){
            System.out.println(emloyees.get(i));
        }
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 1; i < 4; i++){
            number.add(i);
        }
        for (int num : number) {
            System.out.println(num);
        }
        ArrayList<String> all = new ArrayList<>();
        System.out.println();
    }
}
