package Companies.meituan.XiangLiang.New3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ask = new int[n];
        int[] gift = new int[m];
        int[] price = new int[n];
        for(int i = 0;i<n;i++){
            ask[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            gift[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            price[i] = sc.nextInt();
        }
        Arrays.sort(gift);
        for(int i =0;i<n;i++){

            System.out.print(lowPrice(ask[i],price[i],gift)+" ");
        }
        System.out.println();
    }
    static int lowPrice(int kinds,int low,int[] gift){
        int howMany = 0;
        int totalPrice = 0;
        for(int i =0;i<gift.length;i++){
            if(gift[i]>=low){
                if(howMany>=kinds){
                    break;
                }
                howMany++;
                totalPrice += gift[i];
            }
        }
        return howMany<kinds ?-1:totalPrice;
    }

}
