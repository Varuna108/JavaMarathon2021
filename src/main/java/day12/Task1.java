package main.java.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listOfAuto = new ArrayList<>();

        listOfAuto.add("BMW");
        listOfAuto.add("Mercedes");
        listOfAuto.add("Tefal");
        listOfAuto.add("Yamaha");
        listOfAuto.add("Ingenico");

        listOfAuto.add(3, "SsanYoung");

        listOfAuto.remove(4);

        for (String i: listOfAuto) {
            System.out.println(i);
        }

    }
}
