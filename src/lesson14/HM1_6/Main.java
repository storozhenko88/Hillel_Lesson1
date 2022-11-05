package lesson14.HM1_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(111,"Book", 74, true, LocalDate.of (2022, 9, 10)));
        products.add(new Product(102,"Book", 500, false, LocalDate.of (2022, 10, 10)));
        products.add(new Product(255,"Toy", 220, false, LocalDate.of (1999, 11, 11)));
        products.add(new Product(155,"Car", 1420, true, LocalDate.of (1998, 9, 12)));
        products.add(new Product(232,"Book", 100, false, LocalDate.of (1998, 9, 10)));
        products.add(new Product(201,"Book", 26, true, LocalDate.of (2022, 7, 10)));
        products.add(new Product(159,"Book", 99, true, LocalDate.of (2001, 8, 10)));
        products.add(new Product(169,"Toy", 10, true, LocalDate.of (2005, 9, 5)));
        products.add(new Product(174,"Toy", 320, false, LocalDate.of (1999, 7, 10)));
        products.add(new Product(109,"Car", 2200, false, LocalDate.of (2001, 1, 8)));

        System.out.println(groupProducts(products));
    }

    public static Map<String, List<Product>> groupProducts (List<Product> products){
        return products
                .stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
