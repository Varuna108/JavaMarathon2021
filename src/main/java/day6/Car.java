package main.java.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    private int year;
    private String model;
    private String color;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference() throws IOException { // разница между введенным годом и полученным в классе
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите год для расчета разницы объекта автомобиль: ");
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
