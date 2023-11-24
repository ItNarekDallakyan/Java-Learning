package file_io.lvl_1.base_second.creating;

import java.io.File;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {

        String fileName ="MyFile.txt";
        String filePath ="./src/creating";

        File myFile = new File(filePath+"/"+fileName);

        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
