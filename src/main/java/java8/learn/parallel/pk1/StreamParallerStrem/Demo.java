package java8.learn.parallel.pk1.StreamParallerStrem;

import java.util.ArrayList;
import java.util.List;

public class Demo {
  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      employees.add(new Employee(20000, "A"));
      employees.add(new Employee(3000, "B"));
      employees.add(new Employee(15002, "C"));
      employees.add(new Employee(7856, "D"));
      employees.add(new Employee(200, "E"));
      employees.add(new Employee(50000, "F"));
    }
    long t1 = System.currentTimeMillis();
    System.out.println("Sequential Stream count" + employees.stream()
            .filter(employee -> employee.getSalary() > 15000)
            .count()
    );
    long t2 = System.currentTimeMillis();
    System.out.println("Sequental Stream Time Taken : " + (t2 - t1));

    t1 = System.currentTimeMillis();
    System.out.println("Parallel Stream count" + employees.parallelStream()
            .filter(employee -> employee.getSalary() > 15000)
            .count());
    t2 = System.currentTimeMillis();
    System.out.println("Parallel Stream Time Taken : " + (t2 - t1));

  }


}

