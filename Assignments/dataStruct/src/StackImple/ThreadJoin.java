package StackImple;

/**
 * Created by pritigupta on 2/4/17.
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();


        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread starts"+Thread.currentThread().getName());


        System.out.println("Thread ends"+Thread.currentThread().getName());
    }

}
