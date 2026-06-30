package JavaBasicsTasks;

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Mehsulun qiymetini daxil edin ");
        int a = u.nextInt();
        if (a >= 1000) {
            int c = a - a * 25 / 100;
            System.out.println("sizin endirimli qiymetiniz " + c);
        }

        if (a >= 500 && a < 1000) {
            int c = a - a * 15 / 100;
            System.out.println("sizin endirimli qiymetiniz " + c);
        }

        if (a >= 200 && a < 500) {
            int c = a - a * 10 / 100;
            System.out.println("sizin endirimli qiymetiniz " + c);
        } else if (a < 200) {
            System.out.println("teessufki endiriminiz yoxdur " + a);
        }

    }

}
