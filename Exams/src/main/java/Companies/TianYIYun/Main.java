package Companies.TianYIYun;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        for(int i =0;i<n;i++){
            int cur = sc.nextInt();
            if(cur == 0){
                arr[0]++;
            }else if(cur == 1){
                arr[1]++;
            }else if(cur == 2){
                arr[2]++;
            }
        }
        for(int i = 0;i<arr[0];i++){
            System.out.print(0+" ");
        }
        for(int i = 0;i<arr[1];i++){
            System.out.print(1+" ");
        }
        for(int i = 0;i<arr[2];i++){
            System.out.print(2+" ");
        }

    }
}
