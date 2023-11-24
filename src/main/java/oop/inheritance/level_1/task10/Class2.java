package oop.inheritance.level_1.task10;

public class Class2 extends Class1 {

    public void metod(){
        for(int i = 0; i < computers.length; i++ ){
            if(computers[i].getRam() > 2)
                System.out.println(computers[i].getName());
        }
        
    }
}