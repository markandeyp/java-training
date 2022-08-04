package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerIODemo {
    private static final String FILE_PATH = "/Users/markandey/Desktop/Zensark/Java/JavaTraining/src/io/names.txt";

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(FILE_PATH);
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
