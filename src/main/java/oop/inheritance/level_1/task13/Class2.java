package oop.inheritance.level_1.task13;

public class Class2 extends Class1 {

    public void metod(){
        for (int i = 0; i < coins.length; i++) {
            System.out.print(coins[i]);
            if(coins[i] < 3){
                System.out.print(" Metaxadrami qashy avelacel e "+(3-coins[i]) +"ov");
                coins[i] = 3;
            }
            System.out.println();
        }

    }
}