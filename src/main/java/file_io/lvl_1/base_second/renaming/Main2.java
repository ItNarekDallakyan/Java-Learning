package file_io.lvl_1.base_second.renaming;

import java.io.File;

//rename Folder
public class Main2 {
  public static void main(String[] args) {

    String folderName ="AAA";
    String newFolderName ="BBB";
    String filePath = System.getProperty("user.home")+"/Desktop";

    File myFile = new File(filePath+"/"+folderName);

    myFile.renameTo(new File(filePath+"/"+newFolderName));


  }
}
