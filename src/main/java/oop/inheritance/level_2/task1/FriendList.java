package oop.inheritance.level_2.task1;

import java.util.Arrays;

public class FriendList extends Friend{
    private Friend friends[] = {
            new Friend("Karine","123456",new Date(2,2,1998)),
            new Friend("Marine","235456",new Date(8,9,1998)),
            new Friend("Narine","478556",new Date(6,1,1997))
    };
    public void counter(){
        // Dasavorum enq ynkernerin yst cnvac amisneri ajman kargi
        Friend temp;
        for (int i = 0; i < friends.length; i++) {
            for(int j = 0; j < friends.length; j++)
                if(friends[i].date.getMonth() < friends[j].date.getMonth()){
                    temp = friends[i];
                    friends[i] = friends[j];
                    friends[j] = temp;
                }
        }

        Friend birthday = friends[0];
        int day = 0;
        for(int i = 1; i < friends.length;i++){
            day = (friends[i].date.getMonth() - birthday.date.getMonth())*30 + (30-birthday.date.getDay()) + friends[i].date.getDay();
            birthday = friends[i];
            System.out.print(day +" ");
        }

    }

    @Override
    public String toString() {
        return "FriendList{" +
                "friends=" + Arrays.toString(friends) +
                '}';
    }
}