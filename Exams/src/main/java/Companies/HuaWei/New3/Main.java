package Companies.HuaWei.New3;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(areaSum(arr, n));
    }

    static int areaSum(int[] arr, int n) {
        int[][] dp = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += maxDiv(i, j, arr,dp) % 1000000007 * (j - i + 1) % 1000000007;
            }
        }
        return sum% 1000000007;
    }

    static int maxDiv(int left, int right, int[] arr,int[][] dp) {
        int MAX_CNT = arr[left];
        int MIN_CNT = arr[left];
        for (int i = left; i <= right; i++) {
            MAX_CNT = MAX_CNT > arr[i] ? MAX_CNT : arr[i];
            MIN_CNT = MIN_CNT < arr[i] ? MIN_CNT : arr[i];
        }
        return MAX_CNT-MIN_CNT;
    }
}
