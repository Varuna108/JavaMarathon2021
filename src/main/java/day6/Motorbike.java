package main.java.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference() throws IOException { // разница между введенным годом и полученным в классе
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите год для расчета разницы объекта мотоцикл: ");
        int inputYear = Integer.parseInt(bReader.readLine());
        int resultDifference = 0;
        if (inputYear > year) {
            resultDifference = inputYear - year;
        } else {
            resultDifference = year - inputYear;
        }
        return resultDifference;
    }

}
