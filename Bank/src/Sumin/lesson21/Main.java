package Sumin.lesson21;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Bob", "!", "Hello"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        for (String s : arr
        ) {
            System.out.println(s);
        }
    }
}
