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

    int yearDifference(int inputYear) { // разница между введенным годом и полученным в классе
        return Math.abs(inputYear - year);
    }

}
