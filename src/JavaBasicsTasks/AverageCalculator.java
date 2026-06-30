package JavaBasicsTasks;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int a = u.nextInt();
        int b = u.nextInt();
        int c = u.nextInt();
        int d = u.nextInt();
        int k = u.nextInt();
        int cem = a + b + c + d + k;
        double orta = (double)cem / (double)5.0F;
        int big = a;
        if (b > a) {
            big = b;
        }

        if (c > big) {
            big = c;
        }

        if (d > big) {
            big = d;
        }

        if (k > big) {
            big = k;
        }

        System.out.println("cem " + cem);
        System.out.println("ededi orta " + orta);
        System.out.println("en boyuk eded " + big);
    }
}
