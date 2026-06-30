package JavaBasicsTasks;

import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("ededleri daxil edin");
        int a = u.nextInt();
        int b = u.nextInt();
        int c = u.nextInt();
        if (a + b > c) {
            if (a == b && b == c) {
                System.out.println("beraberterefli ucbucaq");
            } else if (a != b && b != c && a != c) {
                System.out.println("muxterefli ucbucaq");
            } else {
                System.out.println("Beraberyanli ucbucaq");
            }
        }

    }
}
