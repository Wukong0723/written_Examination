package Companies.Qihu.NEW1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] scores = new int[n];
        for(int i =0;i<n;i++){
            scores[i] = sc.nextInt();
        }
        System.out.println(max_num(n,p,q,scores));
    }
    static int max_num(int n ,int p,int q,int[] scores){
        int res = 0;
        int ordinary_Score = 100;
        Arrays.sort(scores);
        int cur = scores[n-1];
        for(int i = n-1;i>=0;i--){
            if(cur !=scores[i]){
                ordinary_Score--;
                cur = scores[i];
            }
            if(ordinary_Score<0){
                return res;
            }
            double finalScore = (double) (scores[i]*q +ordinary_Score*p)/100;
            if(finalScore >= 60.0){
                res++;
            }else{
                return res;
            }
        }
        return res;
    }

}
