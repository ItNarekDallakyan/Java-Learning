package oop.asbtraction.task_1_hradziqner;

public class Main {

    public static void main(String[] args) {


        Hradziq  [] krakoxner = {new Norek("Norek1",18,1),
                    new Pordzaru("Pordzaru1",25,5),
                    new Profi("Profi1",45,20),
                    new Pordzaru("Pordzaru2",30,10),
                    new Norek("Norek2",20,2)};

        for (Hradziq krakox : krakoxner) {
            krakox.Info();
            if (krakox.krakel()) {
                System.out.println("Tirax@ xocela");
                System.exit(1);
            } else System.out.println("Chi kpel");
        }
    }
}
