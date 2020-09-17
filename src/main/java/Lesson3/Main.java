package Lesson3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        FileReader fr;
        FileWriter fw;

        //File file = new File("test.txt");
        //System.out.println(file.getName());

        fis = new FileInputStream(new File("test.txt"));

        byte[] arr = new byte[50];
        int count = 0;

        while((count = fis.read(arr)) != -1) {
            for (int i = 0; i < count; i++) {
                System.out.print((char)arr[i]);
            }
        }
    }
}
