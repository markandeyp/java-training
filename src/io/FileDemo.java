package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    static void writeNameToFile(String name) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("/Users/markandey/Desktop/Zensark/Java/JavaTraining/src/io/names.txt");

            for (char c : name.toCharArray()) {
                outputStream.write(c);
            }

            outputStream.write('\n');

        } catch (FileNotFoundException ex) {
            System.out.println("File names.txt doesn't exist. Create it.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    static void readNamesFromFile() {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("/Users/markandey/Desktop/Zensark/Java/JavaTraining/src/io/names.txt");
            while (inputStream.available() > 0) {
                int bYte = inputStream.read();
                System.out.print((char) bYte);
            }
            System.out.println();
        } catch (FileNotFoundException ex) {
            System.out.println("File names.txt doesn't exist. Create it.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        readNamesFromFile();
        writeNameToFile("Jonathan");
        readNamesFromFile();
    }
}
