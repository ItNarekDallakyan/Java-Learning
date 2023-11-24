package file_io.lvl_1.base;

import java.io.File;
import java.util.Date;


public class Main7 {
    public static void main(String[] args){
        File file = new File("test.txt");
        Date date = new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: " + date + "\n");
    }
}