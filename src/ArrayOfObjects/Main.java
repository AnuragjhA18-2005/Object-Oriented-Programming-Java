package ArrayOfObjects;
public class Main {
    public static void main(String[] args) {
       Car[] cars = {
           new Car("BMW", "Metallic Blue"),
           new Car("Impala", "White"),
           new Car("Mercedes", "Black")
       };

       for (Car car : cars) {
           car.color = "White";
           car.drive();
       }
    }
}
