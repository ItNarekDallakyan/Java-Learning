package java8.learn.nio;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileUsingBufferWriter5 {
  public static void main(String[] args) {

    try {
      String path = "d:/data/abc.txt";
      String content = "Hello World2";
      BufferedWriter writer = Files.newBufferedWriter(Paths.get(path));
      writer.write(content);
      writer.close();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}
