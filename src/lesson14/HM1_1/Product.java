package lesson14.HM1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
   private String type;
   private int price;

    public Product(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
