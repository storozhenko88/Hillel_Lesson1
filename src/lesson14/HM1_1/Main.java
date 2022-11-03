package lesson14.HM1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Book", 320));
        products.add(new Product("Book", 500));
        products.add(new Product("Toy", 220));
        products.add(new Product("Car", 1420));
        products.add(new Product("Book", 100));
        products.add(new Product("Book", 420));
        products.add(new Product("Book", 220));
        products.add(new Product("Toy", 10));
        products.add(new Product("Toy", 320));
        products.add(new Product("Car", 2200));

        System.out.println(getInfoByBook(products));
    }
    public static List<Product> getInfoByBook (List<Product> products){

        return products.stream()
                .filter(product -> (product.getType().equals("Book") && product.getPrice() > 250))
                .collect(Collectors.toList());
    }
}
