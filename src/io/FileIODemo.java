package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {
    private static final String FILE_PATH = "/Users/markandey/Desktop/Zensark/Java/JavaTraining/src/io/names.txt";

    static void writeNameToFile(String name) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(FILE_PATH, true);

            outputStream.write('\n');

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
            inputStream = new FileInputStream(FILE_PATH);
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
