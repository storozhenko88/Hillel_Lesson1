package lesson8.geometric_figures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sumArea = 0;
        Shape[] geometricFigures = inputData();

        for (Shape figures: geometricFigures) {
            sumArea += figures.calcArea();
        }

        System.out.printf("%n The total area of the figures is %.2f", sumArea);

    }

    public static Shape[] inputData(){
        Scanner scanner = new Scanner(System.in);
        int count;
        int choice;

        System.out.print("How many geometric figures you will create? (enter count): ");
        count = scanner.nextInt();

        Shape[] geometricFigures = new Shape[count];

        do {
            System.out.print("""
                    Enter the number of the shape you want to add
                    1 - triangle
                    2 - square
                    3 - circle
                    0 - exit
                    """);
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> {
                    count--;
                    geometricFigures[count] = createTriangle();
                }
                case 2 -> {
                    count--;
                    geometricFigures[count] = createSquare();
                }
                case 3 -> {
                    count--;
                    geometricFigures[count] = createCircle();
                }
                default -> System.out.println("You entered the wrong number, try again");
            }
            if (count == 0)
                choice = 0;

        }while (choice != 0);

        return geometricFigures;
    }

    public static Triangle createTriangle (){
        Scanner scan = new Scanner(System.in);
        double sideLength;
        Triangle triangle = new Triangle();
        System.out.print("enter the side length triangle: ");
        sideLength = scan.nextDouble();
        triangle.setSideLength(sideLength);
    return triangle;
    }

    public static Square createSquare (){
        Scanner scan = new Scanner(System.in);
        double sideLength;
        Square square = new Square();
        System.out.print("enter the side length square: ");
        sideLength = scan.nextDouble();
        square.setSideLength(sideLength);
        return square;
    }

    public static Circle createCircle (){
        Scanner scan = new Scanner(System.in);
        double radius;
        Circle circle = new Circle();
        System.out.print("enter the radius circle: ");
        radius = scan.nextDouble();
        circle.setRadius(radius);
        return circle;
    }
}
