package MethodOvveride;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Fish fish = new Fish();

        dog.move();
        // fish.move();->this prints This Animal runs but fish doesnt run  after adding override method in Fish
        fish.move();
    }
}
