package Companies.BeiKe.New1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0;i<T;i++){
            System.out.println(func(sc.nextInt()));
        }
    }
    static int func(int n){
        if(n == 1 || n==2){
            return 1;
        }
        if(n == 3){
            return 2;
        }

        if(n % 2 ==0){
            return n/2;
        }else{
            return n/2+1;
        }

    }
}