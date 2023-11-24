package exceptions.training.examples;

import java.io.FileNotFoundException;

public class Master  {
    public static void main(String... args){
        Example example = new Example();

        try {
            example.fuk();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
