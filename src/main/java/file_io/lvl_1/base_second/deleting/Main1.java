package file_io.lvl_1.base_second.deleting;

import java.io.File;

//deleting folder
public class Main1 {
  public static void main(String[] args) {
    String fileName = "My File.txt";
    String filePath = System.getProperty("user.home")+"/Desktop";

    File file = new File(filePath+"/"+fileName);

    file.delete();

  }
}
