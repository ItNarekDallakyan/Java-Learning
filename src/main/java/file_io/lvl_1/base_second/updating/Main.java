package file_io.lvl_1.base_second.updating;

import java.io.*;

public class Main {
  public static void main(String[] args) {
    String fileName = "MyFile.txt";
    String filePath = System.getProperty("user.home") + "/Desktop";

    try {
      BufferedReader reader = new BufferedReader(new FileReader(filePath+"/"+fileName));

      String string = reader.readLine();

      string = string+" other text";

      BufferedWriter writer = new BufferedWriter(new FileWriter(filePath+"/"+fileName));
      writer.write(string);
      writer.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
