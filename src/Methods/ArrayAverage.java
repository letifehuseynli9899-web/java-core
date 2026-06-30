package Methods;

import java.util.Scanner;

public class ArrayAverage {

    static double average(double[] arr) {
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println(average(arr));
    }
}
