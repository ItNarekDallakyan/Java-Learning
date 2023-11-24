package packageing.autoboxing_unboxing.autoboxing.jdk;

import java.util.ArrayList;
import java.util.List;

public class Oracle {
    public static void main(String[] args){

        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 2)
            li.add(i);

        /*
            Kampilyator version

        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 2)
            li.add(Integer.valueOf(i));


        */


    }

    public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer i: li)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }

  /*  public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer i : li)
            if (i.intValue() % 2 == 0)
                sum += i.intValue();
        return sum;
    }*/


}
