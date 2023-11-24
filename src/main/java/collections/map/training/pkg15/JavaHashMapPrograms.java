package collections.map.training.pkg15;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//15) How do you get synchronized HashMap in java?
public class JavaHashMapPrograms {
    public static void main(String[] args){
        //Creating the HashMap 

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        //Getting synchronized Map

        Map<String, Integer> syncMap = Collections.synchronizedMap(map);
    }
}