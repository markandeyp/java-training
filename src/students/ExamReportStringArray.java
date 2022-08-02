package students;

import java.util.Scanner;

public class ExamReportStringArray {
    private String[][] examData = new String[5][6];
    private final Scanner scanner = new Scanner(System.in);

    private int highestScorerIndex = 0;
    private int lowestScorerIndex = 0;

    /*
     * function to accept input from user
     * */
    private String takeInput(String inputName) {
        System.out.printf("Enter %s:", inputName);
        return scanner.next();
    }

    /*
     * function to calculate total marks
     * */
    private int calculateTotal(String maths, String science, String english) {
        return Integer.parseInt(maths) +
                Integer.parseInt(science) +
                Integer.parseInt(english);
    }

    /*
     * function to display the report
     * */
    private void displayReport() {
        System.out.println("Name | Maths | Science | English | Total | Percentage");
        for (String[] row : examData) {
            for (String col : row) {
                System.out.printf("%s\t\t", col);
            }
            System.out.println();
        }

        System.out.printf("Highest Scorer\nName:%s, Percentage:%s\n", examData[highestScorerIndex][0], examData[highestScorerIndex][5]);

        System.out.printf("Lowest Scorer\nName:%s, Percentage:%s\n", examData[lowestScorerIndex][0], examData[lowestScorerIndex][5]);
    }

    /*
     * function to run the exam report logic
     * */
    public void run() {
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (int row = 0; row < examData.length; row++) {
            examData[row][0] = takeInput("name");
            examData[row][1] = takeInput("score in maths");
            examData[row][2] = takeInput("score in science");
            examData[row][3] = takeInput("score in english");
            int total = calculateTotal(examData[row][1], examData[row][2], examData[row][3]);

            if (total > maxScore) {
                maxScore = total;
                highestScorerIndex = row;
            }

            if (total < minScore) {
                minScore = total;
                lowestScorerIndex = row;
            }

            int percentage = (total * 100) / 150;
            examData[row][4] = String.valueOf(total);
            examData[row][5] = String.valueOf(percentage);
        }
        displayReport();
    }
}
