package file_io.lvl_1.base;

import java.io.File;

public class Main1 {
    public static void main(String a[])
    {
        File file = new File("C:/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}