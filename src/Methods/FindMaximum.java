package Methods;

import java.util.Scanner;

public class FindMaximum {

    static int max(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        int a = u.nextInt();
        int b = u.nextInt();
        int c = u.nextInt();

        System.out.println("En boyuk eded = " + max(a, b, c));
    }
}
