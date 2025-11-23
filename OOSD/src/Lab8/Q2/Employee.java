package Lab8.Q2;

public class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    
    public String getDescription() {
        return "An employee with a salary of " + salary;
    }
}
