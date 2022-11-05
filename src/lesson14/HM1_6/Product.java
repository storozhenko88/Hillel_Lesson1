package lesson14.HM1_6;

import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private boolean discont;
    private LocalDate date;
    private int id;

    public Product(int id, String type, double price, boolean discont, LocalDate date) {
        this.type = type;
        this.price = price;
        this.discont = discont;
        this.date = date;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public boolean isDiscont() {
        return discont;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discont +
                ", date=" + date +
                ", id=" + id +
                '}' + "\n";
    }
}
