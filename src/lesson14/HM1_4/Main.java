package lesson14.HM1_4;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Book", 320, true, LocalDate.of (1999, 9, 10)));
        products.add(new Product("Book", 500, false, LocalDate.of (2000, 10, 10)));
        products.add(new Product("Toy", 220, false, LocalDate.of (1999, 11, 11)));
        products.add(new Product("Car", 1420, true, LocalDate.of (1998, 9, 12)));
        products.add(new Product("Book", 100, false, LocalDate.of (1998, 9, 10)));
        products.add(new Product("Book", 420, true, LocalDate.of (2002, 7, 10)));
        products.add(new Product("Book", 99, true, LocalDate.of (2001, 8, 10)));
        products.add(new Product("Toy", 10, true, LocalDate.of (2005, 9, 5)));
        products.add(new Product("Toy", 320, false, LocalDate.of (1999, 7, 10)));
        products.add(new Product("Car", 2200, false, LocalDate.of (2001, 1, 8)));

        System.out.println(getLastThreeProducts(products));
    }

    public static List<Product> getLastThreeProducts (List<Product> products){

        return products.stream()
                .sorted((o1, o2) -> o2.getDate().compareTo(o1.getDate()))
                .limit(3)
                .collect(Collectors.toList());
    }
}
