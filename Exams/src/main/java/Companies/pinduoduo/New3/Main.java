package Companies.pinduoduo.New3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < T; i++) {
            System.out.println(squaNum(Long.valueOf(sc.nextLine())));
        }

    }

    public static Long squaNum(Long n) {
        if (n < 4) {
            return 0L;
        }
        if (n < 7) {
            return 1L;
        }
        Long X = 0L;


        X = X - 1L;
        if (X == 0L) {
            return 0L;
        }
        Long innerSum = 2 * X * (X + 1);
        if (n - innerSum < 3) {
            return X * X;
        } else if (n - innerSum == 3) {
            return X * X + 1;
        } else if (n < innerSum + 3 + 2 * (X - 1)) {
            return X * X + (n - innerSum - 3) / 2 + 1;
        } else if (n < innerSum + 6 + 2 * (X - 1)) {
            return X * X + X;
        } else if (n == innerSum + 6 + 2 * (X - 1)) {
            return X * X + X+1;
        } else {
            return X * X + X + 1 + (n - innerSum - 6 - 2 * (X - 1)) / 2;
        }
    }
}