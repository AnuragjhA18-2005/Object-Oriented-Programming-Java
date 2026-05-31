package Super;

public class Main {
    public static void main(String[] args) {
        Person person= new Person("Harry", "Potter");
        Student student=new Student("Anurag", "Jha", 8.5);
        Employee employee= new Employee("Anurag", "Jha", 200000);
        person.showName();
        student.showName();
        student.showCGPA();
        employee.showSalary();
    }
}
