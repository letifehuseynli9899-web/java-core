package JavaBasicsTasks;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Boolean deyer daxil etdirin");
        boolean a = u.nextBoolean();
        boolean b = u.nextBoolean();
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
