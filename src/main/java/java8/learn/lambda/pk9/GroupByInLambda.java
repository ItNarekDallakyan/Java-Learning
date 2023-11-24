package java8.learn.lambda.pk9;

import java8.learn.lambda.pk8.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByInLambda {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    products.add(new Product("p1", "mobile 1", 1000, 2, "Manufacturer 1"));
    products.add(new Product("p2", "mobile 2", 700, 4, "Manufacturer 1"));
    products.add(new Product("p3", "laptop 1", 1200, 6, "Manufacturer 2"));
    products.add(new Product("p4", "laptop 2", 7000, 9, "Manufacturer 2"));
    products.add(new Product("p5", "laptop 3", 7000, 9, "Manufacturer 2"));

    System.out.println("Count the number of each group ");

    Map group = products.stream()
            .collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));
    for (Object groupName : group.keySet()) {
      System.out.println("Group Name : " + groupName);
      System.out.println("Products " + group.get(groupName));
      System.out.println("==============================================");
    }

    System.out.println("Calculate the total number of products in each group");
    Map calcualateGroup = products.stream()
            .collect(Collectors.groupingBy(Product::getManufacturer, Collectors.summingInt(Product::getQuantity)));
    for (Object groupName : calcualateGroup.keySet()) {
      System.out.println("GroupName : " + groupName);
      System.out.println("TotalNumberOfProducts :" + calcualateGroup.get(groupName));
      System.out.println("=============================================");
    }


  }

}
