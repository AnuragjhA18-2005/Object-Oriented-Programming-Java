package Super;

public class Student extends Person{
    // String first; -> dont do these as they shadow the fields in person
    // String last;
    double cgpa;

    Student(String first,
    String last,
    double cgpa){
        super(first,last);
        this.cgpa=cgpa;
    }

    void showCGPA(){
        System.out.println(this.first +"'s CGPA is "+this.cgpa);
    }
}
