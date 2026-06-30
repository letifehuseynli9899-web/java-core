package LoopsAndArrays;

public class ReverseArrayPrint {

    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30, 40, 50};

        for(int i = a.length; i >= 0; --i) {
            System.out.println(a[i]);
        }

    }
}
