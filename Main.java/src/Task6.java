import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;
        int n = in.nextInt();
        if (n < 3) {
            System.out.println(0);
            return;
        }
        int p = in.nextInt();
        int c = in.nextInt();
        int count = 0;

        for (int i = 2; i < n; i++) {
            int next = in.nextInt();
            if (c > p && c > next) {
                count++;
            }
            p = c;
            c = next;
        }
        System.out.println(count);
    }
}