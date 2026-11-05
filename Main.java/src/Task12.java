import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int p = in.nextInt();
        int b = 1;
        for (int h : a) {
            if (h >= p) {
                b++;
            } else {
                break;
            }
        }
        System.out.println(b);
    }
}