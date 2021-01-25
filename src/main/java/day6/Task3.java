package main.java.day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("John");      // создание объекта Student
        Teacher teacher = new Teacher("ph. D. David Blein", "Magic");       // создание объекта Teacher

        teacher.evaluate(student.name);

    }
}
