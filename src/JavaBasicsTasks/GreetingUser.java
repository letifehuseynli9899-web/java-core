package JavaBasicsTasks;

import java.util.Scanner;

public class GreetingUser {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Zəhmət olmasa adınızı daxil edin: ");
        String ad = u.nextLine();
        System.out.println("Salam " + ad + " Xoş gelmişsiniz!");
    }
}
