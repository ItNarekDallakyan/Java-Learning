package collections.map.training.pkg1;

import java.util.HashMap;

//Explain the different ways of creating HashMap in java?

/*Below example shows 4 different methods for creating HashMap.*/

public class HashMap1 {
    public static void main(String[] args){
        //1. Creating HashMap with default initial capacity and load factor

        HashMap<String, Integer> map1 = new HashMap<>();

        //2. Creating HashMap with 30 as initial capacity

        HashMap<String, Integer> map2 = new HashMap<>(30);

        //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor

        HashMap<String, Integer> map3 = new HashMap<>(30, 0.5f);

        //4. Creating HashMap by copying another HashMap

        HashMap<String, Integer> map4 = new HashMap<>(map1);

    }
}
