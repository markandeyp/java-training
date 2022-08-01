package oops;

/*
 * To overload a function, you can have
 * 1) Different number of parameters
 * 2) Different type of parameters
 * 3) Different order of parameters
 * */
public class Overloading {
    int add(int number1, int number2) {
        return number1 + number2;
    }

    int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Overloading demo = new Overloading();
        System.out.printf("%s+%s=%s\n", 10, 20, demo.add(10, 20));
        System.out.printf("%s+%s+%s+%s=%s\n", 10, 20, 30, 40, demo.add(new int[]{10, 20, 30, 40}));
    }
}
