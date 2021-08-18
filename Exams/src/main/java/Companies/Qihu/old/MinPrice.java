package Companies.Qihu.old;

import java.lang.reflect.Array;
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
            int[] add = {100,200,360,220};
            int[] del = {120,350,200,320};

            int n = str.length();
            int[][] dp = new int[n][n];
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if(j-i <1){
                        continue;
                    }
                    if(str.charAt(j) == str.charAt(i) ){
                        dp[i][j] = dp[i+1][j-1];
                    }
                    else{
                        dp[i][j] = Math.min(dp[i+1][j]+Math.min(add[str.charAt(j)-'1'],del[str.charAt(j)-'1']),
                                dp[i][j-1]+Math.min(add[str.charAt(i)-'1'],del[str.charAt(i)-'1']));
                    }
                }
            }
            return dp[1][n-1];
        }
    }

}
