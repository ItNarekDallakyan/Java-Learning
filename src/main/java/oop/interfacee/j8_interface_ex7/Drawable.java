package oop.interfacee.j8_interface_ex7;

//default method in interface


interface Drawable {
    void draw();

    default void msg(){
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class TestInterfaceDefault {
    public static void main(String args[]){
        Drawable d = new Rectangle();
        d.draw();
        d.msg();
    }
}