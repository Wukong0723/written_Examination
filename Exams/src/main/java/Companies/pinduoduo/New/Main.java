package Companies.pinduoduo.New;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int group = 0; group < T; group++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] red = new int[n];
            int[] blue = new int[m];

            for (int i = 0; i < n; i++) {
                red[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                blue[i] = sc.nextInt();
            }
            System.out.println(maxNum(n, m, k, red, blue));
        }
    }

    private static int maxNum(int n, int m, int k, int[] red, int[] blue) {
        int res = 0;
        Arrays.sort(red);
        Arrays.sort(blue);
        int[] blueUsed = new int[m];
        Arrays.fill(blueUsed,1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (blue[j]-red[i]>k ){
                    break;
                }else{
                    if(blueUsed[j] == 1 && red[i] -blue[j]<=k){
                        blueUsed[j] =0;
                        res++;
                        break;
                    }
                }
            }
        }
        return res;
    }

}