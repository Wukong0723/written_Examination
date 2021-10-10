package Companies.pinduoduo.ZhengShiPi.New1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] shelf = new int[n];
        String[] input1 = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            shelf[i] = Integer.valueOf(input1[i]);
        }
        int[] dp = new int[shelf.length+1];
        for(int i = 1;i<=shelf.length;i++){
            dp[i] =dp[i-1] + shelf[i-1];
        }
        int m = Integer.parseInt(sc.nextLine());
        String[] input2 = sc.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            System.out.println(findBook(shelf, dp,Integer.valueOf(input2[i]) ));
        }
    }

    static int findBook(int[] shelf, int[] dp,int target) {
        for(int i = 1;i<=shelf.length;i++){
            if(target<=dp[i]){
                return i;
            }
        }

        return 1;
    }

}
