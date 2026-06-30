package JavaBasicsTasks;

import java.util.Scanner;

public class LeapYearChecker {


    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Il daxil edin");
        int a = u.nextInt();
        if ((a % 4 != 0 || a % 100 == 0) && a % 400 != 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}
