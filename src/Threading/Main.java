package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("You have 10s to enter your name");
        // If we add the waiting for loop of 10 seconds here .. out program will have to wait for 10s secodns till this executes to take user input to solve this problem we will create a runnable class and add a run method there which will run this 2nd thread simultatnously with the main thread 
        // for (int i = 0; i < 10; i++) {
        //     try {
        //         Thread.sleep(1000);
        //     } catch (InterruptedException e) {
        //         System.out.println("The Thread Was interrupted ");
        //     }
        //     if (i==9) {
        //         System.out.println("Times Up");
        //         System.exit(0);
        //     }
        // }
        // Now we gotta intiate the 2nd thread here as follows 
        MyRunnable myRunnable= new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); //this is going to make sure that once the main thread is finished this 2nd thread also ends 
        thread.start();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name= sc.next();
        System.out.println("Hello "+name);

        sc.close();

    }
}
