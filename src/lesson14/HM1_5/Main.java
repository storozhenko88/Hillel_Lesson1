package lesson14.HM1_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Book", 74, true, LocalDate.of (2022, 9, 10)));
        products.add(new Product("Book", 500, false, LocalDate.of (2022, 10, 10)));
        products.add(new Product("Toy", 220, false, LocalDate.of (1999, 11, 11)));
        products.add(new Product("Car", 1420, true, LocalDate.of (1998, 9, 12)));
        products.add(new Product("Book", 100, false, LocalDate.of (1998, 9, 10)));
        products.add(new Product("Book", 26, true, LocalDate.of (2022, 7, 10)));
        products.add(new Product("Book", 99, true, LocalDate.of (2001, 8, 10)));
        products.add(new Product("Toy", 10, true, LocalDate.of (2005, 9, 5)));
        products.add(new Product("Toy", 320, false, LocalDate.of (1999, 7, 10)));
        products.add(new Product("Car", 2200, false, LocalDate.of (2001, 1, 8)));

        System.out.println(getTotalCoastBook(products));
    }

    public static Double getTotalCoastBook (List<Product> products){

        return   products.stream()
                .filter(p -> p.getDate().getYear() == LocalDate.now().getYear())
                .filter(p -> p.getType().equals("Book"))
                .filter((p -> p.getPrice() < 75))
                .mapToDouble(Product::getPrice)
                .sum();

    }
}
