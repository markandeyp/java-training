package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;

public class FileReaderDemo {
    private static final String FILE_PATH = "/Users/markandey/Desktop/Zensark/Java/JavaTraining/src/io/names.txt";

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(FILE_PATH);
            char[] buffer = new char[1000];
            int readChars = reader.read(buffer);
            char[] data = Arrays.copyOf(buffer, readChars);
            System.out.printf("%s characters read\n", readChars);
            System.out.println(String.valueOf(data));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
