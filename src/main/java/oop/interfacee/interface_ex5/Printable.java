package oop.interfacee.interface_ex5;

interface Printable {
    void print();
}

interface Showable {
    void print();
}

class TestInterface3 implements Printable, Showable {




    public static void main(String args[]){
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }


    public void print(){
        System.out.println("Hello");
    }
}