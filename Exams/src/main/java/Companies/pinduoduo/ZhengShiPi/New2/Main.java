package Companies.pinduoduo.ZhengShiPi.New2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int cnt =0;cnt<T;cnt++){
            int n = sc.nextInt();
            int m =sc.nextInt();
            int k =sc.nextInt();
            int[][] arr =new int[n][m];
            for(int i =0;i<n;i++){
                for(int j = 0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            HashSet<Integer> set = new HashSet<>();
            System.out.println(solutionNum(arr,n,m,k,0,0,set));

        }
    }
    static int solutionNum(int[][] arr,int n,int m,int k,int x,int y,HashSet<Integer> set){
        if(x>=m || y>=n || set.contains(arr[x][y])){
            return 0;
        }
        if(x == m-1 && y ==n-1){
            return 1;
        }
        set.add(arr[x][y]);

        return solutionNum(arr,n,m,k,x+1,y, new HashSet<>(set))+solutionNum(arr,n,m,k,x,y+1, new HashSet<>(set));
    }

}



/*

3
3 3 7
1 1 2
5 5 8
3 9 7
3 3 6
10 9 6
10 10 10
1 7 4
3 3 7
1 4 9
10 6 10
3 3 5
 */