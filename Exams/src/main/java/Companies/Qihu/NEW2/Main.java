package Companies.Qihu.NEW2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        System.out.println(max_num(n, m, x, k, scores));
    }

    static int max_num(int n, int m, int x, int k, int[] scores) {
        for (int i = 0; i < m; i++) {
            int minPos = 0;
            int minNum = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (scores[j] < minNum) {
                    minPos = j;
                    minNum = scores[i];
                }
            }
            int addPos = 0;
            if (n - 1 - minPos < x) {
                addPos = n - 1 - x;
            } else if (minPos - 1 < x) {
                addPos = x;
            } else {
                addPos = minPos;
            }
            for (int cnt = -x; cnt <= x; cnt++) {
                scores[cnt+addPos] += k;
            }

        }

        return Arrays.stream(scores).min().getAsInt();
    }

}
