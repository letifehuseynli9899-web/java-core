package JavaBasicsTasks;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int a = u.nextInt();
        int b = u.nextInt();
        int c = u.nextInt();
        int big = a;
        if (b > a) {
            big = b;
        }

        if (c > big) {
            big = c;
        }

        System.out.println(big);
    }
}
