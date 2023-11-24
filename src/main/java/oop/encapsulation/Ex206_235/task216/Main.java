package oop.encapsulation.Ex206_235.task216;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        final int A = 600000;
        Employee employee[] = {new Employee( 2, 200000),
                new Employee(5,50000),
                new Employee(1, 150000),
                new Employee(3,3000000),
                new Employee(4, 96000)};



        for(int i = 0; i < n; i++){
            if( employee[i].getSalary() < A ){
                System.out.println(employee[i]);
            }
        }

    }
}