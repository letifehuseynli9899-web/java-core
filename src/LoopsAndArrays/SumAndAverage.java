package LoopsAndArrays;

public class SumAndAverage {


    public static void main(String[] args) {
        int cem = 0;

        for(int i = 1; i <= 50; ++i) {
            cem += i;
        }

        System.out.println("cem " + cem);
        System.out.println("ededi orta " + cem / 50);
    }
}
