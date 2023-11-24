package oop.asbtraction.task_1_hradziqner;

public class Profi extends Hradziq {
    public Profi(String name, int age, int staj) {
        super(name, age, staj);
    }

    @Override
    public boolean krakel() {
        if (Math.random()<=(0.9-0.01*getAge()))
            return true;
        else return false;
    }

    @Override
    public void Info() {
        super.Info();
    }
}

