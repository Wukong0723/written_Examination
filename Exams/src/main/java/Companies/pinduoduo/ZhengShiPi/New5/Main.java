package Companies.pinduoduo.ZhengShiPi.New5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 7;


        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = dp[2] + dp[1];
//        dp[4] = dp[3] + dp[2] + dp[2] + dp[1];

        Arrays.fill(dp,1,7,1);
        int[] nums = {1, 2, 3, 4, 5, 6};
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<6 && nums[j]<i ;j++){
                dp[i] += dp[i-nums[j]]*dp[nums[j]];
            }
        }

        System.out.println(Arrays.asList(dp));


    }

}
