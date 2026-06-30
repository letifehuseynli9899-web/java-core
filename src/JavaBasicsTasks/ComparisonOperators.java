package JavaBasicsTasks;

import java.util.Scanner;

public class ComparisonOperators {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Ededleri daxil edin");
        int a = u.nextInt();
        int b = u.nextInt();
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
    }
}
