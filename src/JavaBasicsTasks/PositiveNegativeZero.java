package JavaBasicsTasks;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int a = u.nextInt();
        if (a < 0) {
            System.out.println("menfi");
        } else if (a > 0) {
            System.out.println("musbet");
        } else {
            System.out.println("Sifir");
        }

    }
}
