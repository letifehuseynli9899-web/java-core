package LoopsAndArrays;

import java.util.Scanner;

public class FindMaximumElement {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0; i < 10; ++i) {
            a[i] = u.nextInt();
        }

        int max = a[0];

        for(int i = 1; i < 10; ++i) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
}
