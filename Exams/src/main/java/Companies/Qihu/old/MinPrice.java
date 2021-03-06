package Companies.Qihu.old;


import java.util.*;

public class MinPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        MinPrice.Solution solution = new MinPrice.Solution();
        System.out.println(solution.minPrice(str));
    }

    public static class Solution {
        int minPrice(String str) {
            int[] add = {100, 200, 360, 220};
            int[] del = {120, 350, 200, 320};

            int n = str.length();
            int[][] dp = new int[n][n];

            for (int L = 2; L < n; L++) {
                for (int i = 0; i < n; i++) {
                    int j = i+L-1;

                    if (str.charAt(j) == str.charAt(i)) {
                        dp[i][j] = dp[i + 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i + 1][j] + Math.min(add[str.charAt(j) - '1'], del[str.charAt(j) - '1']),
                                dp[i][j - 1] + Math.min(add[str.charAt(i) - '1'], del[str.charAt(i) - '1']));
                    }

                }
            }

            return dp[0][n - 1];
        }
    }

}
