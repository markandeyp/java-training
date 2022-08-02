import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a, b;
        double c, d;
        String option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter double numbers");
        c = sc.nextDouble();
        d = sc.nextDouble();
        System.out.println("Enter a valid option");
        option = sc.next();
        switch (option) {
            case "+":
                System.out.println("adition of given integer number is " + (a + b));
                System.out.println("adition of given double number is " + (c + d));
                break;
            case "-":
                System.out.println("subtraction of given integer number is " + (a - b));
                System.out.println("subtraction of given double number is " + (c - d));
                break;
            case "/":
                System.out.println("division of given integer number is " + (a / b));
                System.out.println("division of given double number is " + (c / d));
                break;
            case "*":
                System.out.println("mulutiplication of given integer number is" + (a * b));
                System.out.println("mulutiplication of given double number is " + (c * d));
                break;
        }
    }
}
