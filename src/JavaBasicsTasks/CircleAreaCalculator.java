package JavaBasicsTasks;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("radiusu daxil edin");
        double r = u.nextDouble();
        double b = r * r * Math.PI;
        System.out.println(b);
    }
}
