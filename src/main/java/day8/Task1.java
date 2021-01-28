package main.java.day8;

public class Task1 {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();              // StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println("Время первого цикла: " + timeConsumedMillis1);



        long start2 = System.currentTimeMillis();             // JustString
        String someString = "";
        for (int i = 0; i <= 20000; i++) {
            someString += i + " ";
        }
        System.out.println(someString);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println("Время второго цикла: " + timeConsumedMillis2);

        System.out.println("Разница между первым и вторым способом: " + (timeConsumedMillis2 - timeConsumedMillis1));
    }
}
