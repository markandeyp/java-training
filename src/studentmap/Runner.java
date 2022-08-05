package studentmap;

//import students.ExamData;

import java.util.Scanner;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Set<studentmap.Student> Name;
        final Scanner scanner = new Scanner(System.in);
//        ExamReport app = new ExamReport();
        ExamData app = new ExamData();
        app.run();
        char loop;
        do {
        System.out.println("Enter your choice(1 for search by name & 2 for search by percentage)");
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the name");
                Name= app.searchByName(scanner.next());
                for (Student stud : Name) {
                    System.out.println(stud);
                }
                break;
            case 2:
                System.out.println("Enter percentage to search");
                Name= app.searchByPercentage(scanner.nextFloat());
                for (Student stud : Name) {
                    System.out.println(stud);
                }
                break;

        }
            System.out.println("To continue y  or n");
            loop=scanner.next().charAt(0);
        }
        while(loop=='Y'||loop=='y');
    }
}
