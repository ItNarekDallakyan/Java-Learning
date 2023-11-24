package file_io.lvl_1.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main18 {
     public static void main(String [ ] args) throws FileNotFoundException{
              new Main18().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("/home/students/test.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}