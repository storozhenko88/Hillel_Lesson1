package lesson14.HM1_3;

public class Product {
    private String type;
    private double price;
    private boolean possibilityDiscount;

    public Product(String type, double price, boolean possibilityDiscount) {
        this.type = type;
        this.price = price;
        this.possibilityDiscount = possibilityDiscount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPossibilityDiscount() {
        return possibilityDiscount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", possibilityDiscount=" + possibilityDiscount +
                '}';
    }
}
