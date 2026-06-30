package JavaBasicsTasks;

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("cari qiymet " + x);
        ++x;
        System.out.println("netice " + x);
        System.out.println("cari qiymet " + x);
        int n2 = x++;
        System.out.println("netice " + n2);
        System.out.println("cari qiymet " + x);
        int n3 = x--;
        System.out.println("netice " + n3);
        System.out.println("cari qiymet " + x);
        --x;
        System.out.println("netice " + x);
    }
}
