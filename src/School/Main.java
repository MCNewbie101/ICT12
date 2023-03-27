package School;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School(new ArrayList<Teacher>(), new ArrayList<Student>(), "Teyvat High", 2020, 1000000000);
        school.addStudent(new Student("Kokomi", "Sangonomiya", 12));
        school.addStudent(new Student("Albedo", "Kreideprinz", 12));
        school.addStudent(new Student("Jean", "Gunnhildr", 12));
        school.addStudent(new Student("Barbara", "Pegg", 9));
        school.addStudent(new Student("Jin", "Yun", 11));
        school.addStudent(new Student("Tao", "Hu", 10));
        school.addStudent(new Student("Ayaka", "Kamisato", 11));
        school.addStudent(new Student("Heizou", "Shikanoin", 11));
        school.addStudent(new Student("Xiangling", "Mao", 9));
        school.addStudent(new Student("Rubedo", "Kreideprinz", 12));
        school.addTeacher(new Teacher("Venti", "Cecili", "Music"));
        school.addTeacher(new Teacher("Li", "Zhong", "History"));
        school.addTeacher(new Teacher("Ei", "Raiden", "Physical Education"));
        school.deleteStudent(school.getStudents().get(1));
        school.deleteStudent(school.getStudents().get(8));
        school.deleteTeacher(school.getTeachers().get(2));
        school.listStudents();
        school.listTeachers();
    }
}