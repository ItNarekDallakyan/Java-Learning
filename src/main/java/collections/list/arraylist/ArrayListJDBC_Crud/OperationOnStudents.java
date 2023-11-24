package collections.list.arraylist.ArrayListJDBC_Crud;

//import java.util.ArrayList;


import java.util.Scanner;

public class OperationOnStudents {


    public static void main(String[] args){

        int option;

        Scanner scanOption = new Scanner(System.in);

        do {
            System.out.println("1. Using ArrayList.");
            System.out.println("2. using JDBC.");
            System.out.println("3. Exit");
            System.out.println("\nEnter your option : ");
            option = scanOption.nextInt();
            getoptionFromUser(option);
        } while(option != 3);

    }

    private static void getoptionFromUser(int option) {
        ServiceClassUsingArrayLists objectServiceArraylist = new ServiceClassUsingArrayLists();
        ServiceClassUsingJDBC objectServiceJDBC = new ServiceClassUsingJDBC();
        switch(option) {
            case 1:
                objectServiceArraylist.menuOfArraylist();
                break;
            case 2:
                objectServiceJDBC.menuOfJdbc();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Enter the proper Number !!!");
        }


    }
}
