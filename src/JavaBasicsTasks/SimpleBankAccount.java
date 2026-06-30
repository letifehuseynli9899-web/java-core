package JavaBasicsTasks;

import java.util.Scanner;

public class SimpleBankAccount {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("nomre daxil edin");
        int a = u.nextInt();
        double b = (double)1000.0F;
        if (a == 1) {
            System.out.print("məbləği daxil edin: ");
            double k = u.nextDouble();
            b += k;
            System.out.println("sizin cari balans " + b);
        } else if (a == 2) {
            System.out.print("məbləği daxil edin: ");
            double k = u.nextDouble();
            b -= k;
            System.out.println("sizin cari balans " + b);
        } else if (a == 3) {
            System.out.println("sizin cari balans" + b);
        }

    }
}
