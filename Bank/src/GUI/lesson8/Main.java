package GUI.lesson8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "src/readfile/text.txt";
        try {
            FileReader input = new FileReader(path);
            int code = input.read();
            while (code != -1){
                System.out.print((char) code);
                code = input.read();
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
