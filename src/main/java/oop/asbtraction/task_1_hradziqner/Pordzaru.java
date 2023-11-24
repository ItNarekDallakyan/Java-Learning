package oop.asbtraction.task_1_hradziqner;

public class Pordzaru extends Hradziq {
    public Pordzaru(String name, int age, int staj) {
        super(name, age, staj);
    }

    @Override
    public boolean krakel() {
        if (Math.random()<=getStaj()*0.05)
            return true;
        else return false;
    }

    @Override
    public void Info() {
        super.Info();
    }
}

