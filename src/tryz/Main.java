package tryz;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 7 / a;
            String az = "ijklij444";
            int bz = Integer.parseInt(az);
            int[] array = new int[12];
            System.out.println(array[13]);
        } catch (ArithmeticException a){
            System.out.println("Devided by zero");
        } catch (Exception q){

        }
        System.out.println("hello");
    }
}
