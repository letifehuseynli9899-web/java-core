package LoopsAndArrays;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        System.out.println("1-ci matrisi daxil edin");

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                a[i][j] = u.nextInt();
            }
        }

        System.out.println("2-ci matrisi daxil edin");

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                b[i][j] = u.nextInt();
            }
        }

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("neticeni daxil edin");

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                System.out.println(c[i][j] + " ");
            }

            System.out.println();
        }

    }
}
