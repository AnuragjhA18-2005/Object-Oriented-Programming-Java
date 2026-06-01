package Interfacees;

public class Main {
    //Interfaces is much like abstraction the methods defined in interface have to be implemented in the classes implementing that interfaces 
    // the difference is a class can implemented more than 1 interface
    public static void main(String[] args) {
        // Predator predator = new Predator() {
            
        // }; cant do this as its an interface 
        Hawk hawk= new Hawk();
        Rabbit rabbit= new Rabbit();
        Fish fish= new Fish();

        hawk.Hunt();
        // rabbit.hunt(); cant do it as it doesnt implement the predator interface
        rabbit.flee();

        fish.Hunt();
        fish.flee();// can do both as it implements both the interfaces 
    }
}
