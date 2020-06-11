package GUI.lesson10;

public class MyThreads implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println("Thread " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
