package lesson14;

import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private boolean discount;
    private LocalDate date;
    private int id;

    public Product(String type, int price) {
        this.type = type;
        this.price = price;
    }
    public Product(String type, double price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
    }
    public Product(String type, double price, boolean discount, LocalDate date) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }
    public Product(int id, String type, double price, boolean discount, LocalDate date) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getType() {
        return type;
    }

    public boolean isDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", date=" + date +
                '}' + "\n";
    }
}
