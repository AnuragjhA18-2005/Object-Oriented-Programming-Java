package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        Bike bike = new Bike();
        Boat boat=new Boat();

        Vehicles[] vehicle= {car,bike,boat};//Polymorpism in many shapes ,car bike and boat are separate objects but they can be grouped as a common object of vehicle
        for (Vehicles vehicles : vehicle) {
            vehicles.go();
        }
        
    }
}
