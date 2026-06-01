package Abstraction;

public class Rectangle extends Shape{
    int length;
    int breath;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breath=breadth;
    }

    @Override
    void area() {
        int a = length*breath;
        System.out.println("The area of rectangle ="+a);
    }
    
}
