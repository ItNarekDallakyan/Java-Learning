package file_io.lvl_1.base_second.renaming;

import java.io.File;

//rename File
public class Main1 {
  public static void main(String[] args) {
    String fileName="a.txt";
    String newFileName ="b.txt";
    String filePath = System.getProperty("user.home")+"/Desktop";

    File myFile = new File(filePath+"/"+fileName);

    myFile.renameTo(new File(filePath+"/"+newFileName));

  }
}
