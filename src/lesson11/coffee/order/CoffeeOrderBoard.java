package lesson11.coffee.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeOrderBoard {

    public static void main(String[] args) {
        List<Order> listOrder = new ArrayList<>();
        int choice;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("""
                    choice:
                    1 - add order
                    0 - exit
                    """);
            choice = scanner.nextInt();
            if (choice == 1)
                listOrder.add(add(listOrder.size()));

        }while(choice != 0);

        do {
            draw(listOrder);
            deliver(listOrder);
        }while (listOrder.size() != 0);
    }

    public static Order add (int lastOrder){
        Scanner scanner = new Scanner(System.in);
        Order orderPerson = new Order();
        orderPerson.setNumberOrder(lastOrder + 1);

        System.out.print("enter name: ");
        orderPerson.setName(scanner.nextLine());

        return orderPerson;
    }

    public static void deliver (List<Order> listOrder){
        Scanner scanner = new Scanner(System.in);
        int numberOrder;

        System.out.print("enter the finished order number: ");
        numberOrder = scanner.nextInt();

        for (int i = 0; i < listOrder.size(); i++) {
            if (listOrder.get(i).getNumberOrder() == numberOrder){
                System.out.println("order " + numberOrder + " issued to " + listOrder.get(i).getName());
                listOrder.remove(i);
                break;
            }
        }
    }

    public static void draw (List<Order> listOrder){

        for (Order person: listOrder) {
            System.out.println(person);
        }
    }
}
