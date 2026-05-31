package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Plant plant= new Plant();
        // Animal animal=new Animal();
        // plant.Photosynthesis(); ->true
        // animal.eats();->true
        Dog dog=new Dog();
        Cat cat=new Cat();
        // dog.eats();->Animal Eats
        // cat.eats();->Animal Eats
        dog.says();
        cat.says();
    }
}
