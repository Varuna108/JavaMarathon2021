package main.java.day11.task1;

public class Courier implements Worker {
    int salary;
    private static final int MAX_SALARY = 100;
    private Warehouse w;
    boolean isPayed;

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public Courier(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }


    @Override
    public void doWork() {
        salary += MAX_SALARY;
        w.incrementDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }

        if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 50000;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
