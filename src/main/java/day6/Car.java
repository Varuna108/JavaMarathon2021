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

    int yearDifference(int inputYear) { // разница между введенным годом и полученным в классе
            return Math.abs(inputYear - year);
    }
}
