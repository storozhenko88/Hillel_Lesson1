package lesson7;

import java.util.Scanner;

public class Main {

    public static int countCats, countDogs;

    public static void main(String[] args) {
        int countAnimals;

        chooseOption();
        countAnimals = countCats + countDogs;

        System.out.printf("""
                
                number of introduced animals - %d
                number of introduced cats - %d
                number of introduced dogs - %d
                """, countAnimals,countCats, countDogs);
    }

    public static void chooseOption(){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                Enter the number of the animal you would like to fill in
                1 - Dog
                2 - Cat
                0 - Exit
                    """);
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> inputDataDogs();
                case 2 -> inputDataCats();
                case 0 -> System.out.println("Bye!");
                default -> System.out.println("You entered the wrong number, try again");
            }
        } while (choice != 0);
        scanner.close();
    }

    public static void inputDataCats(){
        Scanner scan = new Scanner(System.in);
        String name;
        int distance;

        System.out.print("enter the name cats - ");
        name = scan.nextLine();

        Cat cat = new Cat(name);
        countCats++;

        System.out.print("distance = ");
        distance = scan.nextInt();

        cat.run(distance);
        cat.swim(distance);

    }

    public static void inputDataDogs(){
        Scanner scan = new Scanner(System.in);
        String name;
        int distance;

        System.out.print("enter the name dogs - ");
        name = scan.nextLine();

        Dog dog = new Dog(name);
        countDogs++;

        System.out.print("distance = ");
        distance = scan.nextInt();

        dog.run(distance);
        dog.swim(distance);
    }
}
