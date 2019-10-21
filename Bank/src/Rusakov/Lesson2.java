package Rusakov;

public class Lesson2 {
    public static void main(String[] args) {
/*        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 8;
        arr[3] = 9;
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            sum *= arr[i];
        }
        System.out.println(sum);  */

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 8;
        arr[3] = 9;
        int sum = 1;

        int i = 0;
        while (i < arr.length){
            sum *= arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
