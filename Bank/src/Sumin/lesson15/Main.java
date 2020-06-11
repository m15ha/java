package Sumin.lesson15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"main", "bad", "1"};
        Arrays.sort(arr, new MyCompare());
        for (String s : arr
        ) {
            System.out.println(s);
        }
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        for (String z : arr
        ) {
            System.out.println(z);
        }
    }
}
