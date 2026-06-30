package LoopsAndArrays;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int x = u.nextInt();
        int p = 1;

        for(int i = 1; i <= x; ++i) {
            p *= i;
        }

        System.out.println(p);
    }
}
