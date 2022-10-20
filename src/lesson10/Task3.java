package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        int choiceContinue;

        do {
            System.out.print("add the number: ");
            numbersList.add(scanner.nextInt());

            System.out.println("""
                    choice:
                    1 - next
                    0 - exit
                    """);

            choiceContinue = scanner.nextInt();
        }while(choiceContinue != 0);

        System.out.println(numbersList);

        List<Integer> uniqueListNumbers = findUnique(numbersList);

        System.out.println(uniqueListNumbers);
    }



    public static List<Integer> findUnique (List<Integer> numbersList){

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer number: numbersList) {
            if (!uniqueList.contains(number))
                uniqueList.add(number);
        }

        return uniqueList;
    }
}
