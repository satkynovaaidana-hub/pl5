import java.util.Scanner;
import java.util.ArrayList;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int total = 0;
        boolean repeat = true;
        while (repeat) {
            repeat = false;
            for (int i = 0; i < list.size(); i++) {
                int j = i;
                while (j < list.size() && list.get(j).equals(list.get(i))) {
                    j++;
                }

                int len = j - i;
                if (len >= 3) {
                    for (int k = 0; k < len; k++) {
                        list.remove(i);
                    }
                    total += len;
                    repeat = true;
                    break;
                }
            }
        }

        System.out.println(total);
    }
}