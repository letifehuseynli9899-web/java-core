package JavaBasicsTasks;

import java.util.Scanner;

public class GradeSystem {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("bal daxil edin");
        int a = u.nextInt();
        if (a <= 100 && a >= 0) {
            if (a >= 90) {
                System.out.println("Ela");
            } else if (a >= 80) {
                System.out.println("yaxsi");
            } else if (a >= 70) {
                System.out.println("kafi");
            } else if (a >= 60) {
                System.out.println("zeif");
            } else {
                System.out.println("qeyri-kafi");
            }
        } else {
            System.out.println("Duzgun bal daxil edin");
        }

    }

}
