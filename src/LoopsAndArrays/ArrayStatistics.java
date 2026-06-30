package LoopsAndArrays;

import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        double[] a = new double[6];
        double cem = (double)0.0F;

        for(int i = 0; i < 6; ++i) {
            a[i] = (double)u.nextInt();
            cem += a[i];
        }

        double max = a[0];

        for(int i = 1; i < 6; ++i) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        double min = a[0];

        for(int i = 1; i < 6; ++i) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println(min + " minimum qiymet");
        System.out.println(max + " max qiymet");
        System.out.println(cem / (double)6.0F + " ededi orta");
        System.out.println(cem + " cem");
    }
}
