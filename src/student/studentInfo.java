package student;

import java.util.Scanner;

public class studentInfo {
    private final int rowMax = 5;
    private String[][] info = new String[rowMax][6];

    private final int maxMarks = 50;
    private final int maxSubjects = 3;

    private int maxLenInNames = 0;

    private int highestIndex = 0;
    private double highestPercentile = 0;
    private int lowestIndex = 0;
    private double lowestPercentile = 0;

    private int columnsNum = 0;

    private final Scanner scanner = new Scanner(System.in);

    private void addInput() {
        for (int i = 0; i < rowMax; i++) {
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

    private void compareAndGetPercentiles() {
        double highestPercent = 0;
        double lowestPercent = 0;
        for (int rowIndex = 0; rowIndex < info.length; rowIndex++) {
            double startPercent = Double.parseDouble(info[rowIndex][5]);
            double endPercent = 0;
            if (rowIndex < info.length - 1) {
                endPercent = Double.parseDouble(info[rowIndex + 1][5]);
            }

            if (rowIndex == 0) {
                lowestPercent = startPercent;
            }
//            maxLenInNames = startPercent;
            if (highestPercent < startPercent) {
                highestPercent = startPercent;
            } else {
                highestPercent = highestPercent;
            }
            System.out.println("temp low percent is : " + lowestPercent);
            if (lowestPercent > startPercent) {
//                lowestPercent = lowestPercent;
                lowestPercent = startPercent;
            }

            if (highestPercent < endPercent) {
                highestPercent = endPercent;
            } else {
                maxLenInNames = maxLenInNames;
            }

            if (rowIndex < info.length - 1) {
                if (lowestPercent > endPercent) {
//                lowestPercent = lowestPercent;
                    lowestPercent = endPercent;
                }
            }
            if (Double.parseDouble(info[rowIndex][5]) == highestPercent) {
                highestIndex = rowIndex;
            }
            if (Double.parseDouble(info[rowIndex][5]) == lowestPercent) {
                lowestIndex = rowIndex;
            }
            System.out.println("temp low percent 1 is : " + lowestPercent);
        }
//        this.maxLenInNames = maxLenInNames;
        System.out.println("The High scorer index is : " + highestIndex);
        System.out.println("The High scorer percentile is : " + highestPercent);
        System.out.println("The High scorer index is : " + lowestIndex);
        System.out.println("The Low scorer percentile is : " + lowestPercent);
    }

    private void tabularResult() {
        int columns = info[0].length;
        columnsNum = columns;
        System.out.println("THe columsn are: " + columnsNum);
        int tripleColumns = columnsNum * 3;
        System.out.println();
        for (int i = 0; i < tripleColumns; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
                System.out.print("| " + " " + info[i][j] + " " + " |");
            }
            System.out.println();
        }
        System.out.println();

    }

    public void run() {
        addInput();
        compareAndGetPercentiles();
        tabularResult();
    }
}
