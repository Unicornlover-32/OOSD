package Lab6;

public class Teacher extends Person{
    int numCourses;
    String[] courses;

    // Constructor
    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
    }

    // Methods
    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // Course already exists
            }
        }
        if (numCourses < 10) {
            courses[numCourses] = course;
            numCourses++;
            return true; // Course added successfully
        }
        return false; // No space to add more courses
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // Shift courses to the left to remove the course
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[numCourses - 1] = null; // Clear the last element
                numCourses--;
                return true; // Course removed successfully
            }
        }
        return false; // Course not found
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
}


