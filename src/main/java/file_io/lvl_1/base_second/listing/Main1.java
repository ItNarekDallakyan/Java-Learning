package file_io.lvl_1.base_second.listing;

import java.io.File;

//listing files and folders
public class Main1 {
  public static void main(String[] args) {

    String filePath = System.getProperty("user.home")+"/Desktop";

    File myFolder = new File(filePath);

    String [] files =myFolder.list();

    for (String file:files){
      System.out.println(file);
    }


  }
}
