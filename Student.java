import java.util.Vector;

public class Student extends Person{
    private String id;
    private String name;
    private Vector<Course> courses = new Vector<Course>(); // contains all courses the student is registered in

    public Student( String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name; // Get the student name
    }

    public String getId() {
        return id; // Get the student id
    }

    public void registerFor(Course course) {
        courses.add(course); // Adds the course/ registers a student in the given course
    }

    public boolean isRegisteredInCourse(Course course) {
        int i = 0;

        while (i < courses.size()) { // Checks whether the given student is registered for any course in the department
            if (course.getCode() == (courses.get(i).getCode()) && course.getNumber() == courses.get(i).getNumber()) {
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean isRegisteredInCourse(int num) {
        int i = 0;

        while (i < courses.size()) { // Checks whether the given student is registered for any course in the department
            if (courses.get(i).getNumber() == num) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        System.out.println(this.id + " " + this.name);
        System.out.print("Registered courses: ");

        for (int i = 0; i < courses.size(); i ++) {
            System.out.print(courses.get(i).getCode() + " " + courses.get(i).getNumber());
            if (courses.size() - i != 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        return " ";
    }

}
