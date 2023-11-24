package file_io.lvl_1.base_second.writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    String fileName = "MyFile.txt";
    String filePath = System.getProperty("user.home") + "/Desktop";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + "/" + fileName))) {
      writer.write("Welcome from notepad");
      writer.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
