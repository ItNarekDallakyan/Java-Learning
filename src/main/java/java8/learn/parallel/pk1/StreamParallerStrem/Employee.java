package java8.learn.parallel.pk1.StreamParallerStrem;

public class Employee {
  private int salary;
  private String name;

  public Employee() {
  }

  public Employee(int salary, String name) {
    this.salary = salary;
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
