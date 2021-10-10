package Companies.ShenXinFu.New1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{4,5,6,7};
        int i = 2;
        int[] res = shuffle(arr,i);
        for(int a :res){
            System.out.print(a+" ");
        }
    }

    static public int[] shuffle (int[] arr, int i) {
        if(arr.length < i || arr.length <2){
            return arr;
        }
        int[] res = new int[arr.length];
        int left = 0;
        int right = i;
        int pos = 0;
        boolean flag = true;
        while(left < i || right <arr.length){
            if(left>=i){
                res[pos++] = arr[right++];
            }else if(right >= arr.length){
                res[pos++] = arr[left++];
            }else if(flag){
                res[pos++] = arr[left++];
                flag = !flag;
            }else{
                res[pos++] = arr[right++];
                flag = !flag;
            }
        }
        return res;
    }
}