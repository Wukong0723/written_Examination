package Companies.Baidu.New1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        func(arr,n,k);
    }
    static void func(int[][] arr,int n,int k){
        int[][] res =new int[n*k][n*k];
        for(int i =0;i<k*n;i++){
            for(int j=0;j<k*n;j++){
                res[i][j] = arr[i/k][j/k];
            }
        }
        for(int i =0;i<k*n;i++){
            for(int j=0;j<k*n;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
