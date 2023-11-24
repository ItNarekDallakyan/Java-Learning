package oop.inheritance.level_2.task13;

public class WorkerSalary extends Worker{
    public WorkerSalary(int reting, String lastName, String position, int salary) {
        super(reting, lastName, position, salary);
    }

    public void incOrDecSalary(){
        if(reting >=60 && reting <= 75){
            salary += salary*40/100;
        }else{
            if(reting >= 90 && reting <= 100)
                salary += salary*60/100;
            else
                salary -= salary*15/100;

        }

        }

}
