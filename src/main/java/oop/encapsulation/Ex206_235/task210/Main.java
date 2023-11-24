package oop.encapsulation.Ex206_235.task210;



public class Main {

    public static void main(String[] args) {
        int n = 5;
        Employee employee[] = {new Employee("Siranush","Xazaryan",1, 2),
                new Employee("Hayk","Stepanyan",0,1),
                new Employee("Hasmik","Petrosyan",0, 0),
                new Employee("Hrant","Nikoxosyan",1,2),
                new Employee("Mika","Harutyunyan",1,3)};



        for(int i = 0; i < n; i++){
            if(employee[i].getMarried() == 1 && employee[i].getNumberOfChildren() == 2 ){
                System.out.println(employee[i]);
            }
        }

    }
}
