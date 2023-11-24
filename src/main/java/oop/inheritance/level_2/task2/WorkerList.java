package oop.inheritance.level_2.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkerList extends Worker{
    private Worker workers[] = {
            new Worker("Armen",new MyDate(2,11,1998)),
            new Worker("Karen",new MyDate(8,9,1998)),
            new Worker("Suren",new MyDate(6,1,1997))
    };


    public void counter(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String[] now = formatter.format(date).split("/");
        int year;
        int month;
        int day;
        for (int i = 0; i < workers.length ; i++) {
             year = Integer.valueOf(now[2])- workers[i].date.getYear();
             month = Integer.valueOf(now[1]) - workers[i].date.getMonth();
             day = Integer.valueOf(now[0])- workers[i].date.getDay();
            if(Integer.valueOf(now[1])< workers[i].date.getMonth()) {
                month = Integer.valueOf(now[1])+ 12 - workers[i].date.getMonth();
            }
            if(Integer.valueOf(now[0])< workers[i].date.getDay()) {
                day = Integer.valueOf(now[0]) + 30 - workers[i].date.getDay();
            }

            System.out.println(workers[i].getName() + " " +year+ " tari "+ month +" amsis "+ day +" or");
        }


    }

    public void printWorker() {
        System.out.println(super.toString());
    }
}