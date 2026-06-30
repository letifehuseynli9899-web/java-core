package JavaBasicsTasks;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("boy ve ceki daxil edin");
        double a = u.nextDouble();
        double b = u.nextDouble();
        double bmi = b / (a * a);
        System.out.println("statusunuz");
        if (bmi < (double)18.5F) {
            System.out.println("Çəki azlığı (Arıq)");
        } else if (bmi >= (double)18.5F && bmi < 24.9) {
            System.out.println("Normal çəki");
        } else if (bmi >= (double)25.0F && bmi < 29.9) {
            System.out.println("Artıq çəki (Kökəlmə)");
        } else {
            System.out.println("Piylənmə (Opiylik)");
        }

    }
}
