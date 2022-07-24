package student;

import java.util.Scanner;

public class studentInfo {
    private String[][] info = new String[10][6];

    private final int maxMarks = 50;
    private final int maxSubjects = 3;

    private final Scanner scanner = new Scanner(System.in);

    private void addInput() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter your Input: ");
                String lol = "";
                lol = scanner.next();
                info[i][j] = lol;
                System.out.println(info[i][j] + " ");
            }
            int sum = Integer.parseInt(info[i][1]) + Integer.parseInt(info[i][2]) + Integer.parseInt(info[i][3]);
            int totalSubMarks = maxSubjects * maxMarks;
            double percentile = ((double) sum / (double) totalSubMarks) * 100;
            String roundedPercentile = String.format("%.2f", percentile);
            System.out.println("percentile is: " + roundedPercentile);
            System.out.println("sum is: " + sum);
            String ssum = String.valueOf(sum);
            System.out.println("ssum is: " + ssum);
            info[i][4] = ssum;
            info[i][5] = roundedPercentile;
//            System.out.println(ssum.getClass().getSimpleName());
            System.out.println("Row " + i + " is : ");
            for (int ji = 0; ji < 6; ji++) {
                System.out.println(info[i][ji] + " ");
            }
        }
    }

    private int getMaxLenOfName() {
        int maxLenInNames = 0;
        for (int rowIndex = 0; rowIndex < info.length; rowIndex++) {
            System.out.println(rowIndex);
            System.out.println(info[rowIndex][0]);
            String nameStart = info[rowIndex][0];
            System.out.println(nameStart);
            System.out.println(nameStart.length());
            String nameEnd = "";
            if (rowIndex < 10) {
                nameEnd = info[rowIndex][rowIndex + 1];
            }
            if (nameStart.length() > nameEnd.length()) {
                maxLenInNames = nameStart.length();
            } else {
                maxLenInNames = nameEnd.length();
            }
        }
        return maxLenInNames;
    }

    private void tabularResult() {
        int columns = info.length;

    }

    public void run() {
        addInput();
        getMaxLenOfName();
    }
}
