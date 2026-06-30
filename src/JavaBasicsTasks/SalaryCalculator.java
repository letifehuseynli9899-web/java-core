package JavaBasicsTasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("islenmis saat ve saat basi odenis yazin ");
        int a = u.nextInt();
        double b = u.nextDouble();
        if (a <= 40) {
            double c = (double)a * b;
            System.out.println("normal tarif qazanirsiniz " + c);
        } else if (a > 40) {
            int d = a - 40;
            double c = (double)a * b;
            double k = c + (double)1.5F * (double)d;
            System.out.println("sizin qazanciniz " + k);
        }

    }
}
