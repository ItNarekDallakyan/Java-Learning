package java8.learn.nio;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FriteToFileUsingWriter4 {
  public static void main(String[] args) {

    try {
      String path = "c:/data/abc.txt";
      String content = "Hello World";
      Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.CREATE);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
