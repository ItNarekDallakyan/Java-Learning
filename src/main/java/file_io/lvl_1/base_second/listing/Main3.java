package file_io.lvl_1.base_second.listing;

import java.io.File;

//Listing only folders
public class Main3 {
  public static void main(String[] args) {

    String filePath = System.getProperty("user.home")+"/Desktop";

    File myFolder = new File(filePath);

    File [] allFiles =myFolder.listFiles();

    for (File file:allFiles){
      if (file.isDirectory())
        System.out.println("Folder Name is "+file);
    }

  }
}
