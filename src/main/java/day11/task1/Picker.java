package main.java.day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int MAX_SALARY = 80;
    private Warehouse w;
    private boolean isPayed;

    public Picker(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public Picker(Warehouse w) {
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
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
            return;
        }

        if (isPayed = true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += 70000;
        isPayed = true;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
