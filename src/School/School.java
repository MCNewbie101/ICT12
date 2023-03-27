package School;

import java.util.ArrayList;

/*
 * Keeps track of which teachers and students are in the school
 * Contains the name of the school and the year the school was built in
 * Keeps track of the budget of the school
 */
public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private String name;
    private int yearBuilt;
    private int budget;

    /*
     * Creates new School object
     */
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, String name, int yearBuilt, int budget) {
        this.teachers = teachers;
        this.students = students;
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.budget = budget;
    }

    /*
     * Add a new teacher to the list of teachers
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /*
     * Add a new student to the list of students
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /*
     * Remove a teacher from the list of teachers
     */
    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    /*
     * Remove a student from the list of students
     */
    public void deleteStudent(Student student) {
        students.remove(student);
    }

    /*
     * Prints out all full names of subjects of teachers
     */
    public void listTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    /*
     * prints out all full names, grades, and student numbers of students
     */
    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /*
     * Decreases school budget by the input amount
     */
    public void spend(int spent) {
        budget -= spent;
    }

    /*
     * Increases school budget by the input amount
     */
    public void addBudget(int budget) {
        this.budget += budget;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
