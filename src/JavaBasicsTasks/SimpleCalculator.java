package JavaBasicsTasks;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("ededleri daxil edin");
        int a = u.nextInt();
        int b = u.nextInt();
        System.out.println("operator daxil edin");
        char k = u.next().charAt(0);
        if (k == '+') {
            System.out.println(a + b);
        } else if (k == '-') {
            System.out.println(a - b);
        } else if (k == '*') {
            System.out.println(a * b);
        } else if (k == '/') {
            if (b == 0) {
                System.out.println("xeta");
            } else {
                System.out.println(a / b);
            }
        }

    }
}
