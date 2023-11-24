package file_io.lvl_2.controller;


import file_io.lvl_2.model.Human;
import file_io.lvl_2.model.MyAddress;
import file_io.lvl_2.model.MyDate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Control implements Serializable {

    private Human human;
    private MyDate myDate;
    private MyAddress myAddress;
    private List<MyAddress> addresses = new ArrayList<>();
    private ObjectOutputStream oos;
    private List<MyDate> birthday = new ArrayList<>();


    public void work() {


        myDate = new MyDate("1994", "05", "28");

        birthday.add(this.myDate);

        myAddress = new MyAddress("0037",
                "Qanaqer-Zeytun",
                "Varshavyan",
                "Yerevan",
                "6",
                "2");

        addresses.add(myAddress);

        human = new Human("Harutyunyan",
                "Arayik",
                "Armeni",
                "Hay",
                211,
                70,
                birthday,
                "093173070",
                addresses);

        if (myDate.getTari().equals("1994")) {
            objectToTxt();
            jsonConvert();
        } else {
            System.out.println("tarin chi hamapatasxanum");
        }
    }


    private void objectToTxt() {
        oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Object.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.writeObject(human);
        } catch (IOException e) {
            e.printStackTrace();
        }


        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Object.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Human deserializatedObject = null;
        try {
            assert ois != null;
            deserializatedObject = (Human) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(deserializatedObject);
    }


    private void jsonConvert() {
//        Gson gson = new Gson();
//        String json = gson.toJson(human);
//        System.out.println(json);
//        try (FileWriter writer = new FileWriter("C:\\Users\\root\\Desktop\\Object.json")) {
//            gson.toJson(human, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
