package exceptions.training.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

    public void fuk() throws FileNotFoundException{
     //   System.out.println(5/0);
        int arr[] = new int[]{1,2,3};
        System.out.println(arr[5]);

        FileInputStream fileInputStream = new FileInputStream("");

    }


}
