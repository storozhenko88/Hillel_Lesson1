package lesson13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter name book: ");

        Book book = new Book(scanner.nextLine());
    }
}
