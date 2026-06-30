package JavaBasicsTasks;

import java.util.Scanner;

public class AppleOrPear {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("eded daxil edin");
        int a = u.nextInt();
        if (a % 2 == 0 & a % 5 == 0) {
            System.out.println("Alma");
        } else if (a % 2 == 0) {
            System.out.println("Armud");
        } else {
            System.out.println("bolunmur");
        }

    }
}
