package LoopsAndArrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30};
        int[] b = new int[]{40, 50, 60};
        int[] c = new int[6];

        for(int i = 0; i < 3; ++i) {
            c[i] = a[i];
        }

        for(int i = 0; i < 3; ++i) {
            c[i + 3] = b[i];
        }

        for(int i = 0; i < 6; ++i) {
            System.out.println(c[i]);
        }

    }
}
