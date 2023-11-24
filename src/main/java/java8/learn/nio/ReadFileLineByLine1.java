package java8.learn.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileLineByLine1 {
  public static void main(String[] args) {
    String path = "d:/data/myfile.txt";
    try {
      List<String> lines = Files.readAllLines(Paths.get(path));
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
