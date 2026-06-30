package Methods;

import java.util.Scanner;

public class SimpleCalculatorMethod {

    static void printResult(double a, char op, double b) {
        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/')
            System.out.println(a / b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();

        printResult(a, op, b);
    }
}
