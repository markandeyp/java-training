package io;

import java.io.*;

import java.util.Arrays;
import java.util.Scanner;

public class cliTextIO {

    private static final Scanner scanner = new Scanner(System.in);
    private static int choice = 0;
    private static String PATH = "";
    private static String file_Name = "";

    private static String finalPath = "";

    private static String toBeWritten = "";


    static void askForParameters() {
        System.out.println("Enter the file Path: ");
        PATH = scanner.next();
        System.out.println("Enter the file name: ");
        file_Name = scanner.next();
        finalPath = PATH + "/" + file_Name;
    }

    static void writeToFile() {
        FileOutputStream outputStream = null;
//        System.out.println("Enter the file Path: ");
//        PATH = scanner.next();
//        System.out.println("Enter the file name: ");
//        file_Name = scanner.next();
//        String finalPath = PATH + "/" + file_Name;
        askForParameters();
        try {
            System.out.println("Enter the text to be written: ");
            toBeWritten = scanner.next();
            System.out.println();
            outputStream = new FileOutputStream(finalPath, true);

            outputStream.write('\n');

            for (char c : toBeWritten.toCharArray()) {
                outputStream.write(c);
            }

            outputStream.write('\n');

        } catch (FileNotFoundException exep) {
            System.out.println("File " + file_Name + " Not found. ");
        } catch (IOException exep) {
            System.out.println(exep.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException exep) {
                System.out.println(exep.getMessage());
            }
        }
    }

    private void readTheFile() {
        System.out.println("Reading the file :) ");
        System.out.println();
        askForParameters();
        try {
            FileReader reader = new FileReader(finalPath);
            char[] buffer = new char[1000];
            int readChars = reader.read(buffer);
            char[] data = Arrays.copyOf(buffer, readChars);
            System.out.printf("%s characters read\n", readChars);
            System.out.println(String.valueOf(data));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void listOutFile() {
        System.out.println("Listing out the file :) ");
        askForParameters();
        File directory = new File(PATH);
        if (directory.exists()) {
            File[] items = directory.listFiles();
            System.out.println("The files in the current directory are: ");
            System.out.println();
            for (File file : items) {
                String name = file.getName();
                System.out.println(name);
            }
        } else {
            boolean success = directory.mkdir();
            if (success) {
                System.out.println("Data directory created");
                File newFile = new File(directory.getAbsolutePath() + "/" + file_Name);
                try {
                    newFile.createNewFile();
                    FileWriter writer = new FileWriter(newFile);
                    writer.write("Please wait ... The content is being written down and file is saved.");
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    private void defaultCase() {
        System.out.println("No particular choice has been selected :) ");
    }

    public void run() {
        System.out.println("Enter your choice : ");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. List");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                writeToFile();
                break;
            case 2:
                readTheFile();
                break;
            case 3:
                listOutFile();
                break;
            default:
                defaultCase();
                break;
        }
    }
}

