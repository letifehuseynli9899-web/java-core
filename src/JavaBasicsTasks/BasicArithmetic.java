package JavaBasicsTasks;

import java.util.Scanner;

public class BasicArithmetic {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("ededleri daxil edin");
        int a = u.nextInt();
        int b = u.nextInt();
        System.out.println("cem " + (a + b));
        System.out.println("ferq " + (a - b));
        System.out.println("hasil " + a * b);
        System.out.println("tam hisse " + a / b);
        System.out.println("qaliq " + a % b);
    }
}
