package main.java.day6;

public class Teacher {
    private String name;
    private String theme;

    public Teacher(String name, String theme) {
        this.name = name;
        this.theme = theme;
    }

    void evaluate(String student) {
        int min = 2;
        int max = 5;
        int randomNumber = (int)((Math.random() * (max - min)) + min);
        String value;
        if (randomNumber == 2) {
            value = "неудовлетворительно";
        } else if (randomNumber == 3) {
            value = "удовлетворительно";
        } else if (randomNumber == 4) {
            value = "хорошо";
        } else {
            value = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student +
                " по предмету " + theme + " на оценку " + value);
    }
}
