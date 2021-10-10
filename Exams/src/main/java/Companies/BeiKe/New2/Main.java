package Companies.BeiKe.New2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            System.out.println(func(n, str));
        }
    }

    static int func(int n, String str) {
        int res = 0;
        int leftCharac = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                leftCharac++;
            } else {
                if (leftCharac <= 0) {
                    res++;
                }else {
                    leftCharac--;
                }
            }
        }
        return res;
    }
}