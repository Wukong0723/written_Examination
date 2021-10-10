package Companies.XiaoHongShu.New1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int[] input = new int[str.length];
        for(int i = 0;i<str.length;i++){
            input[i] =Integer.valueOf(str[i]);
        }
        System.out.println(get_list(input));
    }
    static ArrayList<ArrayList<Integer>> get_list(int[] str){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int step = 1;
        int len = str.length;
        int cur =0;
        while(len-step>=0){
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i =0;i<step;i++){
                tmp.add(str[cur++]);
            }
            res.add(tmp);
            len-=step;
            step++;

        }

        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->{return b-a;});
        return res;
    }
}



/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i =0;i<N;i++){
            for(int j =0;j<N;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(func(arr,N));
    }
    static int func(int[][] arr, int n){
        int MAX_SUM = arr[0][0];
        int[][] dp = new int[n][n];
        dp[0][0] = arr[0][0];
        for(int i =1;i<n;i++){
            dp[i][0] = arr[i][0]+dp[i-1][0];
        }
        for(int j=1;j<n;j++){
            dp[0][j] = arr[0][j]+dp[0][j-1];
        }
        for(int i = 1;i<n;i++){
            for(int j = 1;j<n;j++){
                dp[i][j]=arr[i][j]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
                if(dp[i][j]>MAX_SUM){
                    MAX_SUM = dp[i][j];
                }
            }
        }


        return MAX_SUM;
    }
}




3
-10 2 -3 3 4 -5 -5 -6 -7

 */