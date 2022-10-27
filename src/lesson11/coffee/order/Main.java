package lesson11.coffee.order;

public class Main {

    public static void main(String[] args) {

        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Nik");
        orderBoard.add("Maikl");
        orderBoard.add("Oleg");
        orderBoard.add("Maks");

        orderBoard.draw();

        System.out.println("\nissue the first order from the list");
        orderBoard.deliver();
        orderBoard.draw();

        System.out.println("\nissue an order from the list by number");
        orderBoard.deliver(3);
        orderBoard.draw();

        System.out.println("\nissue the first order from the list");
        orderBoard.deliver();
        orderBoard.draw();
    }
}
