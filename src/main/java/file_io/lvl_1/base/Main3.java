package file_io.lvl_1.base;

import java.io.File;

public class Main3 {
    public static void main(String[] args){

        File my_file_dir = new File("C:\\Windows");
        if (my_file_dir.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }



    }
}