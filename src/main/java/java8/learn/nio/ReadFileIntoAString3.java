package java8.learn.nio;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileIntoAString3 {
  public static void main(String[] args) {

    try {
      String path = "d:/data/myfile.txt";
      String content = new String(Files.readAllBytes(Paths.get(path)), Charset.forName("UTF-8"));
      System.out.println(content);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
