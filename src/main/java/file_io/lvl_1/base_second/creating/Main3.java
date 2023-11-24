package file_io.lvl_1.base_second.creating;


import java.io.File;
import java.io.IOException;

//creating file in desktop
public class Main3 {
  public static void main(String[] args) throws IOException {


    String fileName = "My File.txt";
    String filePath = System.getProperty("user.home")+"/Desktop";

    File file = new File(filePath+"/"+fileName);

    file.createNewFile();


  }
}
