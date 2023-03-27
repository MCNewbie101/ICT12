package School;

/*
 * Subclass of Person abstract class
 * Keeps track of the grade of a student
 * Generates a unique student ID upon creating object
 */
public class Student extends Person {
    private int grade;
    private int studentID;
    private static int counter = 1;

    /*
     * Creates a new Student object
     */
    public Student(String firstName, String lastName, int grade) {
        super(firstName, lastName);
        this.grade = grade;
        this.studentID = counter;
        counter++;
    }

    /*
     * Moves student to the next grade
     */
    public void gradePassed() {
        grade++;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /*
     * Prints the student's full name, grade, and student number
     */
    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade + ", Student Number: " + studentID;
    }
}
