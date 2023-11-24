package oop.asbtraction.task_2_barevner;

public class Main {

    public static void main(String[] args) {
        Mardik[] marder = {new Pozitiv(), new Himar(), new Realist(), new Himar(), new Realist()};
        Kontroller kontrol=new Kontroller();
        kontrol.Method(marder);
    }
}
