package Companies.pinduoduo.ZhengShiPi.New3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] orderQue = new int[n];
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int shortThan = nums[i];
            for (int j = 0; j < n; j++) {

                if (orderQue[j] == 0) {
                    if (shortThan == 0) {
                        orderQue[j] = i;
                        res[i] = j+1;
                    }
                    shortThan--;
                }
            }

        }
        for(int i =0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
