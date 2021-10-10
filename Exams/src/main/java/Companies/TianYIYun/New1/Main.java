package Companies.TianYIYun.New1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] money ={1,5,10,20,50,100};
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i = 0;i<6;i++){
            for(int j = money[i] ;j<=n;j++ ){
                dp[j] +=dp[j-money[i]];
            }
        }
        System.out.println(dp[n]);
    }
}