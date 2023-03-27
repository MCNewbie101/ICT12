package School;

/*
 * Abstract class
 * Every Person have a first and last name
 */
public abstract class Person {
    private String firstName;
    private String lastName;

    /*
     * Constructor
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
     * Prints full name of person
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName;
    }
}
