package Companies.SIJie.New3;
import java.util.Stack;
public class InsertKuohao {
    public static void main(String[] args) {
        System.out.println(countBracketSequence("())()"));
    }

    public static int countBracketSequence(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
//            StringBuilder sb = new StringBuilder(s);
            if (isCorrect(new StringBuilder(s).insert(i, '('))) {
                res++;
            }
        }
        return res;
    }

    public static boolean isCorrect(StringBuilder str) {
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                ++flag;
            } else if (flag > 0 && str.charAt(i) == ')') {
                --flag;
            } else {
                return false;
            }
        }
        return flag == 0;
    }
}