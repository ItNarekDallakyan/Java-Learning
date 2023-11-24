package oop.inheritance.level_1.task12;

public class Class2 extends Class1 {

    public void metod(){
       String temp;
        for(int i = 0; i < names.length-1; i++ ){
            for(int j = i+1; j < names.length;j++)
            if(names[i].compareToIgnoreCase(names[j] ) > 0){
                temp = names[i];
                names[i] = names[j];
                names[j] = temp;
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}