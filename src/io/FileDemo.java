package io;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class FileDemo {
    private static final String FILE_PATH = "/Users/markandey/Desktop/Zensark/Java/JavaTraining/src/io/data";

    public static void main(String[] args) {
        File directory = new File(FILE_PATH);
        if (directory.exists()) {
            File[] items = directory.listFiles();
            for (File file : items) {
                String dFlag = file.isDirectory() ? "D" : "F";
                String rFlag = file.canRead() ? "R" : "_";
                String wFlag = file.canWrite() ? "W" : "_";
                String xFlag = file.canExecute() ? "X" : "_";
                String name = file.getName();
                System.out.printf("%s%s%s%s\t%s\n", dFlag, rFlag, wFlag, xFlag, name);
            }
        } else {
            boolean success = directory.mkdir();
            if (success) {
                System.out.println("Data directory created");
                File gamesFile = new File(directory.getAbsolutePath() + "/games.txt");
                try {
                    gamesFile.createNewFile();
                    FileWriter writer = new FileWriter(gamesFile);
                    writer.write("TicTacToe\n");
                    writer.write("GuessTheNumber\n");
                    writer.write("GuessTheWord\n");
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
