package Companies.Xioami.New1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(",");
        int m = Integer.parseInt(firstLine[0].substring(2));
        int n = Integer.parseInt(firstLine[1].substring(2));
        int[] a = new int[m + n];
        int[] b = new int[n];
        String[] aStr = sc.nextLine().split(",");
        String[] bStr = sc.nextLine().split(",");
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(aStr[i]);
        }
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(bStr[i]);
        }

        func(a, b, m, n);
        for (int i = 0; i < m + n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    static void func(int[] a, int[] b, int m, int n) {
        int up = m - 1;
        int down = n - 1;
        int pos = m + n - 1;
        while (pos >= 0) {
            if (up < 0) {
                while (down >= 0) {
                    a[pos--] = b[down--];
                }
            } else if (down < 0 || a[up] >= b[down]) {
                a[pos--] = a[up--];
            } else {
                a[pos--] = b[down--];
            }
        }

    }
}
