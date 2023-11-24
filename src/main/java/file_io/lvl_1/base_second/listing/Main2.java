package file_io.lvl_1.base_second.listing;

import java.io.File;

//Listing only files
public class Main2 {
  public static void main(String[] args) {

    String filePath = System.getProperty("user.home")+"/Desktop";

    File myFolder = new File(filePath);

    File [] files =myFolder.listFiles();

    for (File file:files){
      if (file.isFile())
      System.out.println("File Name is "+file);
    }


  }
}
