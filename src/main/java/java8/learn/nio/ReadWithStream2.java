package java8.learn.nio;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadWithStream2 {

    public static void main(String[] args) {
      try {
        String path = "d:/data/myfile.txt";
        Stream stream = Files.lines(Paths.get(path));
        stream.forEach(line -> {
          System.out.println(line);
        });
        stream.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }

    }

}
