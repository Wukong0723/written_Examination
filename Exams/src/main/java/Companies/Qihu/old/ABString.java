package Companies.Qihu.old;

import java.util.Scanner;

public class ABString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ABString.Solution solution = new ABString.Solution();
        System.out.println(solution.minPrice(str));

    }

    //abab --abbba -- bbabba --bbbbaba -- bbbbbbaa
    //abaa -- bbaaa
    //aaab -- aabba --abbaba --abbbbaa -- bbabbbaa -- bbbbabbaa --bbbbbbabaa -- bbbbbbbbaaa
    //abbab --abbbba --bbabbba -- bbbbabba --bbbbbbaba --bbbbbbbbaa
    //abaab --ababba --abbbaba -- abbbbbaa -- bbabbbbaa --bbbbabbbaa --bbbbbbabbaa -- bbbbbbbbabaa --bbbbbbbbbbaaa
    public static class Solution {
        long minPrice(String str) {
            long res = 0;
            long cnt = 0;
            int start = str.length()-1;
            while(start>=0 && str.charAt(start) == 'a'){
                start--;
            }
            for(int i = start ;i>=0;i--){
                if(str.charAt(i) == 'a'){
                    int tmp= 0;
                    while(i>=0 && str.charAt(i) == 'a'){
                        res += cnt;
                        tmp++;
                        i--;
                    }
                }
            }

            return res%1000000007;
        }
    }
}
