import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = in.nextInt();
        for (int i = 1; i < n; i++) {
            int current = in.nextInt();
            if (current > max) {
                max = current;
            }
        }
        System.out.println(max);
    }
}