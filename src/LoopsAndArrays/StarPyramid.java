package LoopsAndArrays;

import java.util.Scanner;

public class StarPyramid {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int c = u.nextInt();

        for(int i = 1; i <= c; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
