package School;

/*
 * Subclass of Person abstract class
 * Have a subject
 * Prints the full name of the teacher and the subject they teach
 */
public class Teacher extends Person {
    private String subject;

    /*
     * Creates a new Teacher object
     */
    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /*
     * Prints out the full name of the teacher and the suject they teach
     */
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}
