package Companies.pinduoduo.old;

import java.util.Arrays;
import java.util.Scanner;

public class DuoduoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        DuoduoSum.Solution solution = new DuoduoSum.Solution();
        System.out.println(solution.minPrice(n, m, arr));

    }

    public static class Solution {
        int minPrice(int n, int m , int[] arr) {
            int res = 0;
            long sum = 0;
            int[] mod  = new int[m];
            mod[0] =1;
            for(int i =0;i<n;i++){
                sum+=arr[i];
                int index = (int) (sum % m);
                res += mod[index]++;

            }
            return res;
        }
    }
}
