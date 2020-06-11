package GUI.lesson9;

import java.io.*;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/readfile/text2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter writer = null;
        try {
            writer = new FileWriter(file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = "Heelo me name is Bob";
        try {
            writer.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter wrt = null;
        try {
            wrt = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s2 = "OMG!!!!";
        try {
            wrt.write(s2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
