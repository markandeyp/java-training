import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double a, b, ans;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the first number :");
        a = s.nextDouble();
        System.out.print("enter the second number:");
        b = s.nextDouble();
        System.out.print("Enter any operator(+,-,*,/):");
        char op = s.next().charAt(0);
        switch (op){
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case  '*':
                ans = a * b;
                break;
            case '/':
                ans = a / b;
                break;
            default:
                System.out.printf("The entered number is Wrong");
                return;
        }
        System.out.println(a+" "+op+" "+b+": "+ans);
    }
}
