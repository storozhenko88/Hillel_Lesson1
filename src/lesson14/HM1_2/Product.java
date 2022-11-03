package lesson14.HM1_2;

public class Product {
    private String type;
    private double price;
    private boolean possibilityDiscount;

    public Product(String type, double price, boolean possibilityDiscount) {
        this.type = type;
        this.price = price;
        this.possibilityDiscount = possibilityDiscount;
    }

    public void setPrice(double price) {
        this.price = price;
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
