package file_io.lvl_1.base_second.reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//reading AllFileContent
public class Main2 {
  public static void main(String[] args) throws IOException {
    String fileName = "a.txt";
    String filePath = System.getProperty("user.home") + "/Desktop";


    BufferedReader reader = new BufferedReader(new FileReader(filePath + "/" + fileName));


    for (String string; (string = reader.readLine()) != null;) {
      System.out.println(string);
    }

  }
}
