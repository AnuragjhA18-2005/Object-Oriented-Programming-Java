package RuntimePoly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your choice");// method executed is decided at runtime based ont the type of object
        Scanner sc = new Scanner(System.in);
        Animals animals;
        int ch = sc.nextInt();
        if (ch==1) {
            animals= new Dog();
            animals.says();;
        }
        else{
            animals=new Cat();
            animals.says();
        }
    }
}
