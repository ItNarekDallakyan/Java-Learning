package mutable_immutable;

public class Main {
    public static void main(String[] args){


        Address myaddress = new Address("Varshavyan", 37, "Yerevan", "AM");
        Person myPerson = new Person("Arayik", "Harutyunyan", myaddress);


//////////////////////////////////////////////////////////////////////
        System.out.println("Printing local variables in myAddress");
        myaddress = new Address("Varshavyan", 38, "Vrastan", "AM"); //3
        //myaddress.setCity("Gyumri");
        //myaddress.setZip(38);
        System.out.println(myaddress);
        System.out.println(myPerson);
/////////////////////////////////////////////////////////////////////
        System.out.println("\nModify field address of myPerson");
        myPerson.setAddress(new Address("Vaxarshyan", 39, "Joomla", "AM")); //4
        //  myPerson.getAddress().setCity("Joomla");
        //  myPerson.getAddress().setZip(39);
        System.out.println(myPerson);
        System.out.println(myaddress);


    }
}


