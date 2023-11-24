package file_io.lvl_1.base_second.creating;

import java.io.File;

public class Main2 {
  public static void main(String[] args) {
    String fileFolder = "MyFolder";
    String filePath = "./src/creating";

    File myFile = new File(filePath + "/" + fileFolder);

    myFile.mkdir();
  }
}
