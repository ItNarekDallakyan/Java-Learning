package oop.asbtraction.task_2_barevner;

public class Himar extends Mardik{
    public Himar() {super();
    }

    @Override
    public String Barev(Mardik m) {
        String barev = getName()+" : " + "Barev " + m.getName();
        return barev;
    }

    @Override
    public void Info() {
        System.out.println("Im anun@ " + getName()+ ", Tariq@" + getAge()+ " es himar mard em");

    }
}
