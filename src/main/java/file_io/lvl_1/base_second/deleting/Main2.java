package file_io.lvl_1.base_second.deleting;

import java.io.File;

//deleting folder
public class Main2 {
  public static void main(String[] args) {

    String filePath = System.getProperty("user.home") + "/Desktop/aaa";

    File file = new File(filePath);

    file.delete();
  }
}
