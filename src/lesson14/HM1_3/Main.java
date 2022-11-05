package lesson14.HM1_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Book", 320, true));
        products.add(new Product("Book", 500, false));
        products.add(new Product("Toy", 220, false));
        products.add(new Product("Car", 1420, true));
        products.add(new Product("Book", 100, false));
        products.add(new Product("Book", 420, true));
        products.add(new Product("Book", 99, true));
        products.add(new Product("Toy", 10, true));
        products.add(new Product("Toy", 320, false));
        products.add(new Product("Car", 2200, false));

        try {
            System.out.println(getBookMinPrice(products));
        } catch (Exception e) {
            System.out.println("Not found book!!!");
        }
    }

    public static Product getBookMinPrice(List<Product> products) {

     return products.stream()
             .filter(product -> product.getType().equals("Book"))
             .min(Comparator.comparingDouble(Product::getPrice))
             .get();

    }
}
