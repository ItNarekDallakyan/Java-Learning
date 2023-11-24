package oop.inheritance.level_2.task9;

public class WorkerList extends Worker{
    private Worker workers[] = {
            new  Worker("cragravorum","Marutyan", 1000000,1990),
            new  Worker("hashvapah","Karapetyan",120000 , 1978),
            new  Worker("dizayner","Simonyan",230000 ,1965)

    };
    public void printWorker(){
        for (Worker worker : workers) {
            if( worker.profession.equalsIgnoreCase("cragravorum")){
                worker.setSalary(worker.salary + worker.salary*20/100);
                System.out.println(worker);
            }
        }
    }

}