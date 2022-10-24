package lesson8.geometric_figures;

public class Square implements Figure {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calcArea() {
        return Math.pow(sideLength, 2);
    }
}
