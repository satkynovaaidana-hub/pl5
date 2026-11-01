import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int p = in.nextInt();

        for (int i = 1; i < n; i++) {
            int c = in.nextInt();
            if ((p > 0 && c > 0) || (p < 0 && c < 0)) {
                System.out.println("YES");
                return;
            }
            p = c;
        }

        System.out.println("NO");
    }
}