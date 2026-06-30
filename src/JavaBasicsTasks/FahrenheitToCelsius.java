package JavaBasicsTasks;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Fahrenheit dərəcəsini daxil edin");
        double a = (double)u.nextInt();
        double c = (a - (double)32.0F) * (double)5.0F / (double)9.0F;
        if (c < (double)0.0F) {
            System.out.println("dondurucu");
        } else if (c > (double)0.0F && c < (double)20.0F) {
            System.out.println("soyuq");
        } else if (c >= (double)20.0F && c < (double)35.0F) {
            System.out.println("isti");
        } else if (c >= (double)35.0F) {
            System.out.println("cox isti");
        }

    }

}
