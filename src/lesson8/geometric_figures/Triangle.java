package lesson8.geometric_figures;

public class Triangle extends Shape{

    private double sideLength;

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calcArea() {
        return Math.sqrt(3) * Math.pow(sideLength, 2) / 4;
    }
}
