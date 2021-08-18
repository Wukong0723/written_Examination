package Companies.pinduoduo.old;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println(n);
        } else if (n > 45 || n < 0) {
            System.out.println(-1);
        } else {
//            Solution solution = new Solution();
//            System.out.println(solution.minNum(n));
            Class clazz  = Solution.class;
            Object obj = clazz.newInstance();
            Method method = clazz.getMethod("minNum",int.class);
            method.invoke(obj,n);

        }
    }

    //123456789
    public static class Solution {
        int minNum(int n) {
            for (int i = 0; i <=123456789; i++) {
                if (checkSingle(i)) {
                    if (checkSum(i, n)) {
                        return i;
                    }
                }
            }
            return -1;
        }

        boolean checkSingle(int i) {
            HashMap<Integer,Integer> mp = new HashMap<>(16);
            while (i > 0) {
                int tmp = i % 10;

                if (mp.containsKey(tmp)){
                    return false;
                }
                mp.put(tmp,1);
                i = i / 10;
            }
            return true;
        }

        boolean checkSum(int i, int n) {
            int sum=0;
            while (i > 0) {
                int tmp = i % 10;
                sum += tmp;
                i = i / 10;
            }
            return sum == n;
        }
    }
}
