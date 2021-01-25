package main.java.day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2021, 200, 15000);    // создание объекта Airplane
        airplane.setYear(1990);
        airplane.setLength(100);
        airplane.fillUp(50);
        airplane.fillUp(10);
        airplane.info();

    }
}
