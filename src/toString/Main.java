package toString;

public class Main {
    public static void main(String[] args) {
        Car car= new Car("Ferrari", "G202", 2025);
        // System.out.println(car); -> Output =toString.Car@372f7a8d this is hash
        // to fix this we can override The Car constructor with a .toString Method and after that 
        System.out.println(car);
        // this gives the desiredoutput Ferrari G202 2025
    }
}
