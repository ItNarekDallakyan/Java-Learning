package file_io.lvl_1.base_second.reading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//reading line of a text
public class Main1 {
  public static void main(String[] args) throws FileNotFoundException {

    String fileName ="a.txt";
    String filePath = System.getProperty("user.home")+"/Desktop";


    BufferedReader reader = new BufferedReader(new FileReader(filePath+"/"+fileName));
    try {
      System.out.println(reader.readLine());
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
