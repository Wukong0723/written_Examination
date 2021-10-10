package Companies.ByteDance.XiangMian1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convert(1234567));

        double d =5.3E12;
        double d1 = 3.14159;
        double d2 = 3.14D;


    }

    static String convert(int n) {
        if (n < 100) {
            return "0." + String.valueOf(n);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n % 10));
        n /= 10;
        sb.append(String.valueOf(n % 10));
        n /= 10;
        sb.append(".");
        int flag = 1;
        while (n > 0) {
            sb.append(String.valueOf(n % 10));
            if (flag  % 3 ==0 && n !=0){
                sb.append(",");
            }
            flag++;
            n /= 10;
        }
        return "rmb "+ sb.reverse().toString();
    }
}
