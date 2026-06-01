package Threading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The Thread Was interrupted ");
            }
            if (i==9) {
                System.out.println("Times Up");
                System.exit(0);//to make sure once the time is up the code is exited 
            }
        }
    }

}
