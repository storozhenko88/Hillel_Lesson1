package lesson11.coffee.order;


import java.util.LinkedList;


public class CoffeeOrderBoard {

    private LinkedList<Order> orders = new LinkedList<>();
    private int orderCounter = 1;

    public void add(String name) {
        Order order = new Order(name, orderCounter);
        this.orders.add(order);
        orderCounter++;
    }

    public Order deliver() {
        if (orders.size() != 0) {
            Order priorityOrder = orders.getFirst();
            orders.removeFirst();

            return priorityOrder;
        } else {
            System.out.println("no current orders");
            return null;
        }
    }

    public Order deliver(int orderNumber) {
        int index = -1;

        for (int i = 0; i < orders.size(); i++)
            if (orders.get(i).getNumberOrder() == orderNumber){
                index = i;
                break;
            }

        if (index >= 0) {
            Order foundOrder = orders.get(index);
            orders.remove(index);
            return foundOrder;
        } else {
            System.out.println("no order for this number");
            return null;
        }
    }


    public void draw() {

        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
