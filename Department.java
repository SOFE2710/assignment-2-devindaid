import java.util.Vector;

public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    public Department(String name, String id) {
        this.name = name;
        this.id = id;
        courseList = new Vector<Course>();
        registerList = new Vector<Student>();
    }

    public String getName() {
        return name; // Get the name of the school
    }

    public String getId() {
        return id; // Get the short name of the courses
    }

    public void offerCourse(Course course) {
        if (!courseList.contains(course)) {
            courseList.add(course); // Adds the given course to the department
        }
    }

    public void registerStudentCourseInDepartment(Student name, Course course) {
        boolean check = true;
        boolean check2 = true;

        for (int i = 0; i < registerList.size(); i++) {
            if (registerList.get(i).getId() == name.getId() && registerList.get(i).getName().equals(name.getName())) {
                check = false;
            }
        }

        if (check)
            registerList.add(name);

        for (int i = 0; i < courseList.size(); i++) {
            if (course.equals(courseList.get(i)))
                check2 = false;
        }

        if (check2) {
            courseList.add(course);
        }
    }

    public void printCoursesOffered() {
        System.out.println(courseList); // Displays list of all offered courses by the department
    }

    public void printStudentsByName() {
        System.out.println(registerList); // Displays a list of all students taking courses in this department
    }

    public boolean isStudentRegistered(Student student) {
        int i = 0;
        while (i < registerList.size()) {
            if (student.getId() == registerList.get(i).getId() && student.getName().equals(registerList.get(i).getId())) {
                return true; // Checks whether a student is registered for any course in the department
            }
            i++;
        }
        return false;
    }

    public void studentsRegisteredInCourse(int code) {

    }

    public void printStudentsRegisteredInCourse(int code) {
        int i = 0;
        while (i < registerList.size()) { // Displays a list of all students registered in a given course
            if (registerList.get(i).isRegisteredInCourse(code)) {
                registerList.get(i).toString();
            }
            i++;
        }
    }

    public String largestCourse() {
        int i = 0;

        int[] courses = new int[courseList.size()];
        String[] hold = new String[courseList.size()];

        while (i < courseList.size()) {
            courses[i] = courseList.get(i).getClassList();
            hold[i] = courseList.get(i).getTitle();
            i++;
        }
        int largest = courses[0];
        String large = hold[0];
        for (int j = 0; j < courses.length; j++) {
            if (courses[j] > largest) {
                largest = courses[j];
                large = hold[j];
            }
        }
        return large; // Returns a course with the largest number of registered students
    }

    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students

        return (name += ": " + courseList.size() + " courses, " + registerList.size() + " student");
    }
}
