package main.java.day9.Task2;

public class Circle extends Figure{
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * (radius* radius);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
}
