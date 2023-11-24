package oop.asbtraction.task_2_barevner;

public class Kontroller {
int count=0;

    public void Method(Mardik[] mard) {
        for (int j = 0; j <5 ; j++) {
            mard[j].Info();
        }

        for (int i =0 ; i<4;i++) {
            for (int j = i + 1; j < 5; j++) {
                System.out.println(mard[i].Barev(mard[j]));
                System.out.println(mard[j].Barev(mard[i]));
                count++;
                System.out.println(count);

            }

        }
    }
}
