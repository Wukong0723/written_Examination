package Companies.Xioami.New2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }

    static int func(int n){
        int res= 0;
        for(int i =2;i<=n;i++){
            res = (res+3)%i;
        }
        return res+1;
    }
}
