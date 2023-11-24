package java8.learn.lambda.pk2;

import java.util.ArrayList;
import java.util.List;

public class LIkeOperatorInLambda {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
    products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
    products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
    products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
    products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2"));


    System.out.println("Starts with mo");
    products.stream()
            .filter(p -> p.getName().startsWith("mo"))
            .forEach(p -> {
              System.out.println(p.toString());
              System.out.println("======================================");
            });


    System.out.println("ends with: top 1");
    products.stream()
            .filter(p -> p.getName().endsWith("top 1"))
            .forEach(p -> {
              System.out.println(p.toString());
              System.out.println("======================================");
            });


    products.stream()
            .filter(p -> p.getName().contains("top"))
            .forEach(p -> {
              System.out.println(p.toString());
              System.out.println("======================================");
            });
  }
}
