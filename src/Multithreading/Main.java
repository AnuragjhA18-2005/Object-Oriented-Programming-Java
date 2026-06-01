package Multithreading;

public class Main {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Myrunnable("PING"));
        Thread thread2=new Thread(new Myrunnable("P0NG"));

        System.out.println("Game Start");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();//before executing the main thread .join method make the main thread wait for these twp threads to finish executing
        } catch (InterruptedException e) {
            System.out.println("Got Interrupted");
        }

        System.out.println("Game over");
    }
}
