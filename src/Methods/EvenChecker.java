package Methods;

import java.util.Scanner;

public class EvenChecker {


    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int a = u.nextInt();

            if (isEven(a))
                System.out.println("Cut");
            else
                System.out.println("Tek");
        }
    }
}
