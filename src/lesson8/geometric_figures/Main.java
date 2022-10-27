package lesson8.geometric_figures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sumArea = 0;
        Figure[] geometricFigures = {new Square(4), new Triangle(6), new Circle(10)};

        for (Figure figure: geometricFigures) {
            sumArea += figure.calcArea();
        }

        System.out.printf("%n The total area of the figures is %.2f", sumArea);
    }
}
