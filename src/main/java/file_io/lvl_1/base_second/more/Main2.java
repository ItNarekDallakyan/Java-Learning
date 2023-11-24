package file_io.lvl_1.base_second.more;

import java.io.File;
import java.io.IOException;

//read and hide parameters
public class Main2 {
  public static void main(String[] args) {
    String fileName = "MyFile.txt";
    String filePath = System.getProperty("user.home") + "/Desktop";
    File file = new File(filePath + "/" + fileName);

    try {
      Runtime.getRuntime().exec("attrib +r -h "+file.getPath());
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
