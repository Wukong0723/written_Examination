package Companies.ByteDance.New2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[Integer.MAX_VALUE-8];
        for(int i = 0;i<n;i++){
            int pos = sc.nextInt();
            int len = sc.nextInt();
            while (len-->0){
                time[pos++]++;
            }
        }
        System.out.println(Arrays.stream(time).max().getAsInt());

    }
}
