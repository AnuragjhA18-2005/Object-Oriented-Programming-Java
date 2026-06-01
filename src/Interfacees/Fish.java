package Interfacees;

public class Fish implements Predator,Prey{

    @Override
    public void flee() {
        System.out.println("The fish is fleeing");
    }

    @Override
    public void Hunt() {
       System.out.println("The Fish is hunting");
    }

}
