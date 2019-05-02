package run1;

public class Main {
    public static void main(String[] args) {
//        RunnableTimer runnableTimer = new RunnableTimer();
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100000; i++) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        timer.start();
//        for (int j =0; j < 100000; j++){
//            System.out.println(2);
//        }
    }
}
