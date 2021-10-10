package Companies.meituan.XiangLiang.New2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] stand = new int[n][3];
        int[][] beauty = new int[m][3];
        for (int i = 0; i < n; i++) {
            stand[i][0] = sc.nextInt();
            stand[i][1] = sc.nextInt();
            stand[i][2] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            beauty[i][0] = sc.nextInt();
            beauty[i][1] = sc.nextInt();
            beauty[i][2] = sc.nextInt();
        }
        System.out.println(tinyMistake(stand, beauty, n, m, k));
    }

    static int tinyMistake(int[][] stand, int[][] beauty, int n, int m, int k) {
        int sum = 0;
        int cnt = 0;
        while (cnt < n && cnt < m) {
            if (beauty[cnt][0] < stand[cnt][0] && beauty[cnt][1] > stand[cnt][1]) {
                if (beauty[cnt][2] == stand[cnt][2]) {
                    sum += stand[cnt][0] - beauty[cnt][0]  < k ? 1 : 0;
                    sum += beauty[cnt][1] - stand[cnt][1] < k ? 1 : 0;
                }else{
                    sum += beauty[cnt][1] - beauty[cnt][0]  < k ? 1 : 0;
                }
            } else if (beauty[cnt][0] >= stand[cnt][0] && beauty[cnt][1] <= stand[cnt][1]) {
                if (beauty[cnt][2] != stand[cnt][2]) {
                    sum += beauty[cnt][1] - beauty[cnt][0]  < k ? 1 : 0;
                }
            } else if (beauty[cnt][0] < stand[cnt][1] && beauty[cnt][1] > stand[cnt][1]) {
                if (beauty[cnt][2] == stand[cnt][2]) {
                    sum += beauty[cnt][1] - stand[cnt][1]  < k ? 1 : 0;
                }else{
                    sum += beauty[cnt][1] - beauty[cnt][0]  < k ? 1 : 0;
                }
            } else if (beauty[cnt][0] < stand[cnt][0] && beauty[cnt][1] > stand[cnt][0]) {
                if (beauty[cnt][2] == stand[cnt][2]) {
                    sum += stand[cnt][0] - beauty[cnt][0]  < k ? 1 : 0;
                }else{
                    sum += beauty[cnt][1] - beauty[cnt][0]  < k ? 1 : 0;
                }
            } else if (beauty[cnt][1] <= stand[cnt][0]) {
                sum += beauty[cnt][1] - beauty[cnt][0]  < k ? 1 : 0;
            } else if (beauty[cnt][0] >= stand[cnt][1]) {
                sum += beauty[cnt][1] - beauty[cnt][0]  < k ? 1 : 0;
            }
            cnt++;
        }

        //n与m不等
        if (n < m) {
            for (int i = n; i < m; i++) {
                if (beauty[i][1] - beauty[i][0] >= k) {
                    sum++;
                }
            }
            return sum;
        } else {
            return sum;
        }
    }
}
