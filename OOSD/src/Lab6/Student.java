package Lab6;

public class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;

    // Constructor
    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
        this.grades = new int[10];
    }

    // Methods
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        System.out.print("Student: " + super.toString());
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i] + " ");
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
               
    }
}
