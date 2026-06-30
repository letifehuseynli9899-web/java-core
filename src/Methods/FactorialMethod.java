package Methods;

import java.util.Scanner;

public class FactorialMethod {

    static long factorial(int n) {
        if (n < 0)
            return -1;

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        int n = u.nextInt();

        System.out.println(factorial(n));
    }
}
