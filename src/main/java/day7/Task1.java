package main.java.day7;



public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2021, 200, 15000);
        Airplane airplane2 = new Airplane("Boing", 2021, 300, 15000);

        Airplane.compareAirlines(airplane1.getLength(), airplane2.getLength());

    }
}