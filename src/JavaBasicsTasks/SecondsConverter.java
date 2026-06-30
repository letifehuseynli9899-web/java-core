package JavaBasicsTasks;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("saniye yazin");
        int a = u.nextInt();
        int b = a / 3600;
        int c = a % 3600 / 60;
        int d = a % 60;
        System.out.println(b + " saat " + c + " deqiqe " + d + " saniye");
    }
}
