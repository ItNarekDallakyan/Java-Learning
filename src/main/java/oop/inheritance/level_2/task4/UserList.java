package oop.inheritance.level_2.task4;

public class UserList extends  User{
    private User users[] = {
            new  User("Mari",new Time(12,11,12),"Ucom"),
            new  User("Davit",new Time(8,9,19),"Viva"),
            new  User("Nare",new Time(20,00,00),"Beeline")
    };


    public void counter(){

        for (int i = 0; i < users.length ; i++) {
            if(users[i].time.getHours()>= 12 && users[i].time.getHours()< 20)
            System.out.println(users[i]);
            if(users[i].time.getHours()== 20 && users[i].time.getMinute()== 0 && users[i].time.getSecond()== 0)
                System.out.println(users[i]);
        }


    }

}