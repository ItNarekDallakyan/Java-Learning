package file_io.lvl_1.base_second.move;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
  public static void main(String[] args) {
    String fileName = "MyFile.txt";
    String filePath = System.getProperty("user.home") + "/Desktop";
    File file = new File(filePath + "/" + fileName);
    File newFile = new File(filePath + "/" + "folder" + "/" + fileName);


    try {
      Files.move(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
