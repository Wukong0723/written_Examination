package Companies.XingYe.New1;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        if ( n%2 == 1 && n * n == target) {
            System.out.println((n/2+1) + " " + (n/2+1));
            return;
        }
        int count = 0;
        int f = 0;


        while (count < n / 2) {
            for (int i = 0; i < n - 2 * count - 1; i++) {
                if (1 + i + f == target) {
                    System.out.println((count + 1) + " " + (count + i + 1));
                    return;
                }
                if ((1 + i + f) + (n - 2 * count - 1) == target) {
                    System.out.println((count + i + 1) + " " + (n - count));
                    return;
                }
                if ((1 + i + f) + 2 * (n - 2 * count - 1) == target) {
                    System.out.println((n - count) + " " + (n - count - i));
                    return;
                }
                if ((1 + i + f) + 3 * (n - 2 * count - 1) == target) {
                    System.out.println((n - count - i) + " " + (count + 1));
                    return;
                }
            }
            count++;
            f += 4 * (n - 2 * count + 1);
        }
    }
}
