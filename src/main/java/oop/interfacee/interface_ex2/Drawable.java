package oop.interfacee.interface_ex2;

//Interface declaration: by first user
interface Drawable {
    void draw();
}

//Implementation: by second user
class Rectangle implements Drawable {
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw(){
        System.out.println("drawing circle");
    }
}

//Using interface: by third user
class TestInterface1 {
    public static void main(String args[]){
        Drawable d = new Circle();//In real scenario,
        Drawable r = new Rectangle();
        r.draw();

        d.draw();
    }
}