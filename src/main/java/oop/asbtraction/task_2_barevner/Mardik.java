package oop.asbtraction.task_2_barevner;

import java.util.Random;

public abstract class Mardik {
    private String name=names();
    private int age = (int) (Math.random()*20+20);

    private String names() {


        String[] names = {"Ալեքսանդր", "Արամ", "Անահիտ", "Իրինա", "Նարինե", "Արմեն", "Հայկ", "Սիլվա", "Սանասար", "Բաղդասար"};

        int x = new Random().nextInt(names.length);
        return names[x];

    }




    public abstract String Barev(Mardik m);




    public abstract void Info();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
