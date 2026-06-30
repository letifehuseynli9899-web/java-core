package JavaBasicsTasks;

import java.util.Scanner;

public class SeasonFinder {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("ayin nomresini daxil edin");
        int a = u.nextInt();
        if (a != 12 && a >= 3) {
            if (a >= 3 && a < 6) {
                System.out.println("spring");
            } else if (a >= 6 && a < 9) {
                System.out.println("summer");
            } else if (a >= 9 && a < 12) {
                System.out.println("autum");
            }
        } else {
            System.out.println("winter");
        }

    }
}
