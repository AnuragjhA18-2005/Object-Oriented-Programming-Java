package Abstraction;

abstract class Shape {
    abstract void area();//we declare the abstract cmethod here but gotta implement it in the class which extends this abstract class 
    void display(){// this is a concrete method so it is available for all children on this abstract class
        System.out.println("This is a shape");
    }
}
