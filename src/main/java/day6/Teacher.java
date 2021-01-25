package day6;

public class Teacher {
    String name;
    String theme;

    public Teacher(String name, String theme) {
        this.name = name;
        this.theme = theme;
    }

    int evaluate(String student) {
        int min = 2;
        int max = 5;
        int randomNumber = (int)((Math.random() * (max - min)) + min);
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student +
                " по предмету " + theme + " на оценку " + randomNumber);
        return randomNumber;  // ?
    }
}
