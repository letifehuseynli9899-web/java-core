package LoopsAndArrays;

import java.util.Scanner;

public class MenuWithDoWhile {


    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);

        int n;
        do {
            System.out.println("1-salam");
            System.out.println("2-sag ol");
            System.out.println("3-cix");
            n = u.nextInt();
            if (n == 1) {
                System.out.println("salam");
            } else if (n == 2) {
                System.out.println("sagol");
            }
        } while(n != 3);

        System.out.println("Proqram bitdi.");
    }
}
