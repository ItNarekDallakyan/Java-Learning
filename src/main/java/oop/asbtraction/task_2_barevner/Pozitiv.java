package oop.asbtraction.task_2_barevner;

public class Pozitiv extends Mardik {

    public Pozitiv() {super();
    }

    @Override
    public String Barev(Mardik m) {
        String barev = getName()+" : " + "Voxjuyn " + m.getName();
        return barev;
    }

    @Override
    public void Info() {
        System.out.println("Im anun@ " + getName()+ ", Tariq@ " + getAge()+ " es positiv mard em");

    }
}
