package lesson11.coffee.order;

public class Order {
    private final String name;
    private final int numberOrder;

    public Order(String name, int numberOrder) {
        this.name = name;
        this.numberOrder = numberOrder;
    }

    public String getName() {
        return name;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    @Override
    public String toString() {
        return name + " | " + numberOrder;
    }
}
