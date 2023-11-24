package oop.inheritance.level_2.task8;

public class WorkerList extends BirthYear{
    private BirthYear workers[] = {
            new  BirthYear("Marutyan", 100000,2010,1990),
            new  BirthYear("Karapetyan",120000 , 1993,1978),
            new  BirthYear("Simonyan",230000 ,1990,1965)

    };
    public void printWorker(){
        for (BirthYear worker : workers) {
            if( worker.adoptionYear>=1990 &&worker.adoptionYear<=1993){
                worker.setSalary(worker.salary + worker.salary*50/100);
                System.out.println(worker);
            }
        }
    }

}