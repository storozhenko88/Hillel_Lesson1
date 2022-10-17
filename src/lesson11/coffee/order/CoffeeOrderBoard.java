package lesson11.coffee.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeOrderBoard {

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
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
                orderList.add(add(orderList.size()));

        }while(choice != 0);

        do {
            draw(orderList);
            deliver(orderList);
        }while (orderList.size() != 0);
    }

    public static Order add (int lastOrder){
        Scanner scanner = new Scanner(System.in);
        Order client = new Order();
        client.setNumberOrder(lastOrder + 1);

        System.out.print("enter name: ");
        client.setName(scanner.nextLine());

        return client;
    }

    public static void deliver (List<Order> orderList){
        Scanner scanner = new Scanner(System.in);
        int numberOrder;

        System.out.print("enter the finished order number: ");
        numberOrder = scanner.nextInt();

        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getNumberOrder() == numberOrder){
                System.out.println("order " + numberOrder + " issued to " + orderList.get(i).getName());
                orderList.remove(i);
                break;
            }
        }
    }

    public static void draw (List<Order> orderList){

        for (Order person: orderList) {
            System.out.println(person);
        }
    }
}
