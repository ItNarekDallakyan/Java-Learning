package oop.inheritance.level_2.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RemedyList extends Remedy{
    private Remedy remedies[] = {
            new Remedy("Albocit",new MyDate(2,11,1998),"1firma"),
            new Remedy("Spazmagon",new MyDate(8,9,1998),"2firma"),
            new Remedy("Teraflyu",new MyDate(6,1,1997),"3firma")
    };


    public void counter(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String[] now = formatter.format(date).split("/");
        int year;
        int month;
        int day;
        for (int i = 0; i < remedies.length ; i++) {
             year = Integer.valueOf(now[2])- remedies[i].date.getYear();
             month = Integer.valueOf(now[1]) - remedies[i].date.getMonth();
             day = Integer.valueOf(now[0])- remedies[i].date.getDay();
            if(Integer.valueOf(now[1])< remedies[i].date.getMonth()) {
                month = Integer.valueOf(now[1])+ 12 - remedies[i].date.getMonth();
            }
            if(Integer.valueOf(now[0])< remedies[i].date.getDay()) {
                day = Integer.valueOf(now[0]) + 30 - remedies[i].date.getDay();
            }

            System.out.println(remedies[i] + " " +year+ " tari "+ month +" amsis "+ day +" or");
        }


    }

}
