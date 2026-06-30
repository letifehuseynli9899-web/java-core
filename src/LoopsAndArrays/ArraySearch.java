package LoopsAndArrays;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int[] a = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
        int n = u.nextInt();

        for(int i = 0; i < a.length; ++i) {
            if (n == a[i]) {
                System.out.println("massivde hemin eded var");
                return;
            }
        }

        System.out.println("massivde yoxdu");
    }
}
