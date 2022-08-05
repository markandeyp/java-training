package io;

import java.io.*;
import java.util.Scanner;


public class CreatingFile {
    static String[] pathnames;
    private static final String FILE_PATH = "C:\\Users\\Dell\\IdeaProjects\\JavaTraining\\src\\assignment";

    public static void main(String args[]) throws FileNotFoundException {
        File directory = new File(FILE_PATH);
        System.out.println("Directory you need to create a file is");
        System.out.println(directory);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("choice 1 to create and write a file");
            System.out.println("choice 2 to list of all files");
            System.out.println("choice 3 to read the file");
            System.out.println("Enter 4 for exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter file name");
                    File name = new File(directory.getAbsolutePath() + "/" + sc.next());
                    try {
                        name.createNewFile();
                        FileWriter writer = new FileWriter(name);
                        System.out.println("Enter file content : ");
                        writer.write(sc.nextLine());
                        writer.write(sc.nextLine());
                        writer.flush();
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    File f = new File("C:\\Users\\Dell\\IdeaProjects\\JavaTraining\\src\\assignment");
                    pathnames = f.list();
                    for (String pathname : pathnames) {
                        System.out.println(pathname);
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter your full file name: ");
                        File filename = new File(directory.getAbsolutePath() + "/" + sc.next());
                        if (filename.exists()) {
                            Scanner readfile = new Scanner(filename);
                            while (readfile.hasNextLine()) {
                                System.out.println(readfile.nextLine());
                            }
                        }
                        else{
                            System.out.println("Sorry file with that name don't exist");
                            System.out.println("Do you want create a new file");
                            System.out.println("Please enter y/n to create a file");
                            char opinion = sc.next().charAt(0);
                            if(opinion=="n".charAt(0) || opinion=="N".charAt(0)){
                                break;
                            }
                            else{
                                System.out.println("Enter file name");
                                File newname = new File(directory.getAbsolutePath() + "/" + sc.next());
                                try {
                                    newname.createNewFile();
                                    FileWriter writer = new FileWriter(newname);
                                    System.out.println("Enter file content : ");
                                    writer.write(sc.nextLine());
                                    writer.write(sc.nextLine());
                                    writer.flush();
                                    writer.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

