package FinalAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TerminalEditor {
    private static final String FILE_PATH = "C:/Java/src/FinalAssignment";

    public static void main(String[] args) {
        File directory = new File(FILE_PATH);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("*******DIRECTORY WORKING IN********\n");

        System.out.println(FILE_PATH);
        System.out.println();

        System.out.println("Creating a terminal text Editor");
        System.out.println("-------------------------------");

        while (true) {
            System.out.println("1. Create a file ");
            System.out.println("2. List a file");
            System.out.println("3. Read a file");
            System.out.println("4. Exit\n");

            System.out.print("ENTER YOUR CHOICE: ");

            int choice = scanner.nextInt();
            System.out.println();


            switch (choice) {
                case 1:
                    System.out.println("Enter a file name to be created: ");
                    File textFile = new File(directory.getAbsolutePath() + "/" + scanner.next());
                    try {

                        boolean fileName = textFile.createNewFile();

                        if (fileName) {


                            FileWriter writer = new FileWriter(textFile);
                            System.out.print("Enter the content to be written in the file: ");


                            writer.write(scanner.nextLine());
                            System.out.println();
                            writer.write(scanner.nextLine());
                            System.out.println();

                            writer.flush();
                            writer.close();


                        } else {
                            System.out.println("File exist with the name ");
                        }

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("The Files Present in the Directory:");
                    System.out.println("-----------------------------------");
                    File textFilePresent = new File(directory.getAbsolutePath());

                    String[] matchingFiles = textFilePresent.list();

                    if (matchingFiles != null) {
                        for (String pathname : matchingFiles) {
                            System.out.println("* " + pathname);
                        }
                        System.out.println();
                    } else {
                        System.out.println("No file exist in current directory.");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter the filename to be read: ");
                        File fileToBeRead = new File(directory.getAbsolutePath() + "/" + scanner.next());

                        if (fileToBeRead.exists()) {
                            Scanner readContent = new Scanner(fileToBeRead);

                            while (readContent.hasNextLine()) {
                                System.out.println(readContent.nextLine());
                            }
                            readContent.close();
                            System.out.println();
                        } else {
                            System.out.println("The file doesn't exist. Do you want to create a new file.");

                            System.out.print("Enter Y/y for YES and N/n for No: ");
                            char exit = scanner.next().charAt(0);
                            System.out.println();

                            if (exit == "n".charAt(0) || exit == "N".charAt(0)) {
                                System.exit(0);

                            } else {
                                System.out.println("Enter a file name to be created: ");
                                File textFile2 = new File(directory.getAbsolutePath() + "/" + scanner.next());
                                try {
                                    boolean fileName2 = textFile2.createNewFile();


                                    if (fileName2) {


                                        FileWriter writer = new FileWriter(textFile2);
                                        System.out.print("Enter the content to be written in the file: ");


                                        writer.write(scanner.nextLine());
                                        System.out.println();
                                        writer.write(scanner.nextLine());
                                        System.out.println();

                                        writer.flush();
                                        writer.close();


                                    } else {
                                        System.out.println("File exist with the name ");
                                    }


                                } catch (IOException ex) {
                                    System.out.println(ex.getMessage());
                                }


                            }

                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice !!! Try Again");
                    System.out.println();
            }


        }
    }
}
