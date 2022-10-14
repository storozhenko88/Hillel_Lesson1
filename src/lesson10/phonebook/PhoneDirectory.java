package lesson10.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDirectory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Recording> directory = new ArrayList<>();
        int choice;

        do {
            System.out.print("""
                    Phone Directory
                    1 - add contact
                    0 - exit
                    """);
            choice = scanner.nextInt();

            if (choice == 1)
                directory.add(add());

        } while (choice != 0);

        System.out.println("\nsearch for a person");
        System.out.println(find(directory));
        System.out.println("\nsearch for a all person :");
        System.out.println(findALL(directory));
    }

    public static Recording add() {
        Scanner scanner = new Scanner(System.in);
        Recording person = new Recording();

        System.out.print("name: ");
        person.setName(scanner.nextLine());

        System.out.print("phone number: ");
        person.setPhoneNumber(scanner.nextLine());

        return person;
    }

    public static String find(List<Recording> directory) {
        String searchName;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a search name: ");
        searchName = scanner.nextLine();

        for (Recording person : directory) {
            if (person.getName().equals(searchName)) {
                searchName += ": phone - " + person.getPhoneNumber();
                count++;
                break;
            }
        }
        if (count == 0)
            return null;
        else
            return searchName;
    }

    public static List<String> findALL(List<Recording> directory) {
        List<String> findInformation = new ArrayList<>();
        String searchName;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a search name: ");
        searchName = scanner.nextLine();

        for (Recording person : directory) {
            if (person.getName().equals(searchName)) {
                count++;
                findInformation.add(searchName + ": phone - " + person.getPhoneNumber());
            }
        }

        if (count == 0)
            return null;
        else
            return findInformation;

    }
}
