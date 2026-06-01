package Abstraction;

public class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    void area() {//implementing the abstract method 
        double a=Math.PI*radius*radius;
        System.out.println("The area of Circle ="+a);
    }
}
