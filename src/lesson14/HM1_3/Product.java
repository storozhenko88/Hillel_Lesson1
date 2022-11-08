package lesson14.HM1_3;

public class Product {
    private String type;
    private double price;
    private boolean discont;

    public Product(String type, double price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discont = discount;
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
                ", price=" + price +
                ", discount=" + discont +
                '}';
    }
}