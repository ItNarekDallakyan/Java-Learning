package file_io.lvl_1.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main10 {
  public static void main(String a[]){
      String file_name = "C:\\Users\\root\\Desktop\\Dark_Net 26 23_33_55 2018.txt";
//        String file_name = "/home/students/test.txt";
      try (InputStream fins = new FileInputStream(file_name)) {
          byte file_content[] = new byte[2 * 1024];
          int read_count = 0;
          while ((read_count = fins.read(file_content)) > 0) {
              System.out.println(new String(file_content, 0, read_count - 1));
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
    }
}