package main.java.day11.task1;

public class Warehouse {
    private int countPickerOrders;
    private int countDeliveredOrders;


    public int getCountPickedOrders() {
        return countPickerOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementDeliveredOrders() {
        countDeliveredOrders++;
    }

    public void incrementPickedOrders() {
        countPickerOrders++;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickerOrders=" + countPickerOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
}
