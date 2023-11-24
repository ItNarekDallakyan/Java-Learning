package oop.asbtraction.task_1_hradziqner;

public class Norek  extends Hradziq{
    public Norek(String name, int age, int staj) {
        super(name, age, staj);
    }
    @Override
    public boolean krakel() {
        if (Math.random()<=getStaj()*0.01)
         return true;
     else return false;
    }

    @Override
    public void Info() {
        super.Info();
    }
}
