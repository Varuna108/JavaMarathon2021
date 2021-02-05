package main.java.day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        System.out.println(picker);
        System.out.println(warehouse);

        businessProcess(courier);
        System.out.println(courier);
        System.out.println(warehouse);

        Warehouse warehouse2 = new Warehouse();
        Courier courier1 = new Courier(warehouse2);
        Picker picker1 = new Picker(warehouse2);
        courier1.doWork();
        picker1.doWork();

        System.out.println(courier);
        System.out.println(picker);
        System.out.println(warehouse);
    }



    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }

        worker.bonus();
    }
}
