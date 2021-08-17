package Companies.pinduoduo.old;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CharChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
//        int n = sc.nextInt();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        CharChange.Solution solution = new CharChange.Solution();
        System.out.println(solution.minPrice(n, str1, str2));

    }

    //123456789
    public static class Solution {
        int minPrice(int n, String str1, String str2) {
            char[] sortStr1 = str1.toCharArray();
            Arrays.sort(sortStr1);
            char[] sortStr2 = str2.toCharArray();
            Arrays.sort(sortStr2);
            int sum =0;

            for (int i = 0; i < n; i++){
                if(sortStr1[i] != sortStr2[i]){
                    sum += Math.abs(sortStr1[i]-sortStr2[i]);
                }
            }
            return sum;
        }
    }
}
