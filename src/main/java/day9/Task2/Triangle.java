package main.java.day9.Task2;

public class Triangle extends Figure {
    private final double aSide;
    private final double bSide;
    private final double cSide;

    public Triangle(String color, double aSide, double bSide, double cSide) {
        super(color);
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public double area() {
        double halfPerimeter = (perimeter()) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide));
    }

    @Override
    public double perimeter() {
        return aSide + bSide + cSide;
    }
}
