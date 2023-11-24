package file_io.lvl_1.base_second.more;

import java.io.File;
import java.text.SimpleDateFormat;

//Modified Date
public class Main {
  public static void main(String[] args) {
    String fileName = "MyFile.txt";
    String filePath = System.getProperty("user.home") + "/Desktop";
    File file = new File(filePath + "/" + fileName);
    System.out.println(file.lastModified());
    SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    System.out.println(myFormat.format(file.lastModified()));
  }
}
