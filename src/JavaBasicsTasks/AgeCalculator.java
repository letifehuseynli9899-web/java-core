package JavaBasicsTasks;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int il = u.nextInt();
        int yas = 2025 - il;
        System.out.println(yas);
    }
}
