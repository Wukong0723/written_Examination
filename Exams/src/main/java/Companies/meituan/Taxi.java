package Companies.meituan;

import java.util.Scanner;
import java.util.*;

/**
 * @author liuxudong
 */
public class Taxi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i =0;i<m;i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            int carTime = sc.nextInt();
            int walkTime = sc.nextInt();
        }

        int[] waitCar = new int[n];
        for(int i=0;i<n;i++){
            waitCar[i]=sc.nextInt();
        }
        int[][] a= new int[10][9];





    }

    class Solution {
        public int longestPalindrome(String s) {
            char[] arr = s.toCharArray();
            HashMap<Character,Integer> mp =new HashMap<>();
            for(char c : arr){
                if(mp.containsKey(c)){
                    int tmp = mp.get(c);
                    mp.put(c,tmp+1);
                }else{
                    mp.put(c,1);
                }
            }
            int res = 0;
            int max_odd = 0;
            for(Map.Entry<Character,Integer> entry : mp.entrySet()){
                if(mp.get(entry) % 2 ==0){
                    res+= mp.get(entry);
                }
                else{
                    max_odd = max_odd > mp.get(entry) ? max_odd : mp.get(entry) ;
                }
            }
            return res+max_odd;
        }
    }



}
