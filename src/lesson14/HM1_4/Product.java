package lesson14.HM1_4;
import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private boolean discont;
    private LocalDate date;

    public Product(String type, double price, boolean discont, LocalDate date) {
        this.type = type;
        this.price = price;
        this.discont = discont;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscont() {
        return discont;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", date=" + date +
                '}' + "\n";
    }

    public LocalDate getDate() {
        return date;
    }
}
