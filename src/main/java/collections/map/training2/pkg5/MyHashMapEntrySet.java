package collections.map.training2.pkg5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMapEntrySet {
 
    public static void main(String a[]){
        HashMap<String, String> hm = new HashMap<>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        Set<Map.Entry<String, String>> entires = hm.entrySet();
        for(Map.Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
    }
}