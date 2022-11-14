package lesson14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        System.out.println("task - 1");
        products.add(new Product("Book", 320));
        products.add(new Product("Book", 500));
        products.add(new Product("Car", 1420));
        products.add(new Product("Book", 100));
        products.add(new Product("Book", 420));
        products.add(new Product("Book", 220));
        products.add(new Product("Toy", 10));
        products.add(new Product("Toy", 320));
        System.out.println(getInfoByProduct(products, "Book") + "\n");

        System.out.println("task - 2");
        products.add(new Product("Book", 620, true));
        products.add(new Product("Book", 550, false));
        products.add(new Product("Car", 2520,true));
        products.add(new Product("Book", 125,false));
        products.add(new Product("Book", 350,true));
        products.add(new Product("Book", 575,true));
        products.add(new Product("Car", 2200,false));
        System.out.println(getProductDiscount(products, "Book"));

        System.out.println("task - 3");
        try {
            System.out.println(getProdMinPrice(products, "Book"));
        } catch (RuntimeException e) {
            System.out.println("Not found book!!!");
        }

        System.out.println("task - 4");
        products.add(new Product("Book", 285, true, LocalDate.of (1999, 9, 10)));
        products.add(new Product("Book", 9250, false, LocalDate.of (2000, 10, 10)));
        products.add(new Product("Car", 2520, true, LocalDate.of (1998, 9, 12)));
        products.add(new Product("Book", 110, false, LocalDate.of (1998, 9, 10)));
        products.add(new Product("Book", 67, true, LocalDate.of (2022, 7, 10)));
        products.add(new Product("Book", 33, true, LocalDate.of (2022, 8, 10)));
        products.add(new Product("Car", 3500, false, LocalDate.of (2001, 1, 8)));
        System.out.println(getLastThreeProducts(products));

        System.out.println("task - 5");
        System.out.println("Total coast - " + getTotalCoastProd(products, "Book"));

        System.out.println("task - 6");
        products.add(new Product(159,"Book", 77, true, LocalDate.of (2001, 8, 10)));
        products.add(new Product(169,"Toy", 9, true, LocalDate.of (2005, 9, 5)));
        products.add(new Product(174,"Toy", 85, false, LocalDate.of (1999, 7, 10)));
        products.add(new Product(109,"Car", 6200, false, LocalDate.of (2001, 1, 8)));
        System.out.println(groupProducts(products));
    }

    public static List<Product> getInfoByProduct (List<Product> products, String prod){

        return products.stream()
                .filter(product -> (product.getType().equals(prod) && product.getPrice() > 250))
                .collect(Collectors.toList());
    }
    public static List<Product> getProductDiscount(List<Product> products, String prod){

        return   products.stream()
                .filter(product -> (product.getType().equals(prod) && product.isDiscount()))
                .map(product -> new Product(product.getType(), (product.getPrice()*0.9), product.isDiscount()))
                .collect(Collectors.toList());
    }
    public static Product getProdMinPrice(List<Product> products, String prod) {

        return products.stream()
                .filter(product -> product.getType().equals(prod))
                .min(Comparator.comparingDouble(Product::getPrice))
                .get();
    }
    public static List<Product> getLastThreeProducts (List<Product> products){

        return products.stream()
                .filter(s -> s.getDate() != null)
                .sorted((o1, o2) -> o2.getDate().compareTo(o1.getDate()))
                .limit(3)
                .collect(Collectors.toList());
    }
    public static Double getTotalCoastProd (List<Product> products, String prod){

        return   products.stream()
                .filter(s -> s.getDate() != null)
                .filter(p -> p.getDate().getYear() == LocalDate.now().getYear())
                .filter(p -> p.getType().equals(prod))
                .filter((p -> p.getPrice() < 75))
                .mapToDouble(Product::getPrice)
                .sum();
    }
    public static Map<String, List<Product>> groupProducts (List<Product> products){
        return products
                .stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
