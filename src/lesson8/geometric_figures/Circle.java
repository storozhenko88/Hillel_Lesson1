package lesson8.geometric_figures;

public class Circle implements Figure {

    private double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * Math.pow(radius, 2);
    }
}
