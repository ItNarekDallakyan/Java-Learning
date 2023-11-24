package oop.composition.my_composition;

public class Camera {
    private String name;


    public Camera(){
    }

    public Camera(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Camera{" +
                "name='" + name + '\'' +
                '}';
    }
}
