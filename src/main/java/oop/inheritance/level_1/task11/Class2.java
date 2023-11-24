package oop.inheritance.level_1.task11;

public class Class2 extends Class1 {
private Car cars[] = {
        new Car(super.cars[0].getModel(),2016,"mardatar",4),
        new Car(super.cars[1].getModel(),2010,"bernatar",2),
        new Car(super.cars[2].getModel(),2017,"mardatar",4)
};

    public void metod(){
        for(int i = 0; i < cars.length; i++ ){
            if(cars[i].getDoors() == 4)
                System.out.print(cars[i].getModel()+" ");
            if(cars[i].getType().equalsIgnoreCase("bernatar"))
                System.out.print(cars[i].getYear());
            System.out.println();
        }

    }
}
