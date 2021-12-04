import java.util.Vector;

public class Course {
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {
        this.dept = dept;
        this.title = title;
        this.code = code;
        this.number = number;
        classList = new Vector<Student>();
    }

    public void addStudentToCourse(Student student) {
        classList.add(student); // Add student to class list
    }

    public String getTitle() {
        return title; // Get the name of the course
    }

    public String getCode() {
        return code; // Get the course code name
    }

    public int getNumber() {
        return number; // Get the course code number
    }

    public int getClassList() {
        return classList.size(); // Get the class list
    }

    public boolean equals(Course course) {
        if (code == (course.getCode()) && number == course.getNumber()) {
            return true;
        }
        return false;
    }

    public Course() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

        System.out.println(code + " " + number + ", " + title + ", Enrollment = " + classList.size());
        return " ";
    }
}
