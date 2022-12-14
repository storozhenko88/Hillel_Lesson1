package lesson13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter name book: ");
        String nameBook = scanner.nextLine();

        String path = "src/lesson13/" + nameBook + ".txt";

        File file = new File(path);
        if (!file.exists()) {
            System.out.println("not book - " + nameBook);
        } else {
            Book book = new Book(path);
            book.generateStatistics(nameBook);
        }

        scanner.close();
    }
}
