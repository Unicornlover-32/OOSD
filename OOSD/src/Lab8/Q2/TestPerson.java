package Lab8.Q2;

public class TestPerson {
    public static void main(String[] args) {
        Person student = new Student("Alisson", "Object Oriented Software Development");
        Person employee = new Employee("Dave", 52000);

        System.out.println(student.getName() + ", " + student.getDescription());
        System.out.println(employee.getName() + ", " + employee.getDescription());
    }
}
