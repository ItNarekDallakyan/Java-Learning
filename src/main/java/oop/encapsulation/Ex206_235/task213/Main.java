package oop.encapsulation.Ex206_235.task213;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        final int G = 60000;
        Employee employee[] = {new Employee("Xazaryan", 2, 200000),
                new Employee("Stepanyan",2,50000),
                new Employee("Petrosyan",1, 150000),
                new Employee("Nikoxosyan",3,3000000),
                new Employee("Harutyunyan",4, 96000)};



        for(int i = 0; i < n; i++){
            if( employee[i].getSalary()/employee[i].getNumberOfFamilyMembers() > G ){
                System.out.println(employee[i]);
            }
        }

    }
}