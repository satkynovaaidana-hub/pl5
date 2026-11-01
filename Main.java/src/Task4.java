import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        int p = in.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int c = in.nextInt();
            if (c > p) {
                count++;
            }
            p = c;
        }
        System.out.println(count);
    }
}