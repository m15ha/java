package Sumin.lesson19;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 11);
            arr.add(n);
        }
//        System.out.println(arr.get(2));
//        for (int z : arr
//             ) {
//            System.out.println(z);
//            }
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        arr.forEach((o1) -> System.out.print(o1 + " "));
        Calendar c = new GregorianCalendar();
        System.out.println(c.getTimeInMillis());
    }
}

