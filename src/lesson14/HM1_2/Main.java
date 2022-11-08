package lesson14.HM1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Book", 320, true));
        products.add(new Product("Book", 500, false));
        products.add(new Product("Toy", 220,false));
        products.add(new Product("Car", 1420,true));
        products.add(new Product("Book", 100,false));
        products.add(new Product("Book", 420,true));
        products.add(new Product("Book", 220,true));
        products.add(new Product("Toy", 10,true));
        products.add(new Product("Toy", 320,false));
        products.add(new Product("Car", 2200,false));

        System.out.println(getBooksDiscount(products));

    }
    public static List<Product> getBooksDiscount(List<Product> products){

       return   products.stream()
                .filter(product -> (product.getType().equals("Book") && product.isDiscount()))
                .map(product -> new Product(product.getType(), (product.getPrice()*0.9), product.isDiscount()))
                .collect(Collectors.toList());
    }
}
