package collections.set.training.pkg0;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSett extends Object {


    public static void main(String[] args){

        Set<String> hashset = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


        hashset.add("Z");
        hashset.add("Pop");
        hashset.add("PP");
        hashset.add("PP");
        hashset.add("A");
        hashset.add("C");
        hashset.add("B");
        hashset.add("D");
        hashset.add("F");
        hashset.add("G");

        linkedHashSet.add("A");
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add("F");
        linkedHashSet.add("G");

        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("F");
        treeSet.add("G");

        System.out.println(hashset);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

        System.out.println(hashset.contains("A"));
        System.out.println(hashset.size());


        hashset.clear();
        System.out.println(hashset);


    }
}
