package Sumin.lesson11;

public class Main {
    static boolean w = false;
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!w){
                    if (i == 5) {
                        w = true;
                    }
                        i++;
                        System.out.println(i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
        thread.start();
    }
}
