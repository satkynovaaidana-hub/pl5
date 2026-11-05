import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        long k =in .nextLong();
        k = k % n;
        if (k < 0) {
            k += n;
        }
        reverse(arr, 0, n - 1);
        reverse(arr, 0, (int)k - 1);
        reverse(arr, (int)k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
    }
    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
}