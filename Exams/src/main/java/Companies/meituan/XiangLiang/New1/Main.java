package Companies.meituan.XiangLiang.New1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i< n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j]<= m){
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }
}
