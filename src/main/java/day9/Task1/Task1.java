package main.java.day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("John", "A");
        Teacher teacher = new Teacher("ph. D. Alexander", "Math");

        student.printInfo();
        teacher.printInfo();

        System.out.println("Учебная группа: " + student.getGroupName());
        System.out.println("Предмет: " + teacher.getSubjectName());



    }
}
