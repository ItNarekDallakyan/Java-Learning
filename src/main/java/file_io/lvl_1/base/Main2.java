package file_io.lvl_1.base;

import java.io.File;
import java.io.FilenameFilter;

public class Main2 {
    public static void main(String a[]){
        File file = new File("C:\\Users\\root\\Desktop");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".py")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}