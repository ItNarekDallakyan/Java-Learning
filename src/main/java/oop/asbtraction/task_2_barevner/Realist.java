package oop.asbtraction.task_2_barevner;

public class Realist extends Mardik {
    public Realist() {super();
    }

    @Override
    public String Barev(Mardik m) {
        String barev="";
        if (m.getAge()<25)
        barev = getName()+" : " + "Barev " + m.getName();
        else barev = getName()+" : " + "Voxjuyn " + m.getName();
        return barev;
    }

    @Override
    public void Info() {
        System.out.println("Im anun@ " + getName()+ ", Tariq@   " + getAge()+ " es realist mard em");

    }
}
