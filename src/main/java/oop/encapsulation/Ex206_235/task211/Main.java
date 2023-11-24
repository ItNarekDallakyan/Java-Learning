package oop.encapsulation.Ex206_235.task211;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        Employee employee[] = {new Employee("Xazaryan", 2),
                new Employee("Stepanyan",0),
                new Employee("Petrosyan",1),
                new Employee("Nikoxosyan",0),
                new Employee("Harutyunyan",4)};



        for(int i = 0; i < n; i++){
            if( employee[i].getNumberOfChildren() >=1 ){
                System.out.println(employee[i]);
            }
        }

    }
}