package main.java.day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                listOfNumbers.add(i);
            }
        }

        for (int i = 300; i <= 350; i++) {
            if (i % 2 == 0) {
                listOfNumbers.add(i);
            }
        }

        for (Integer i : listOfNumbers) {
            System.out.println(i);
        }

    }
}



