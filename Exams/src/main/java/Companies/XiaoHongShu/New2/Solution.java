package Companies.XiaoHongShu.New2;
/*
段式回文类似于回文，最小的单位可以是多个字符而不仅是单个字母 例如：一般的回文字符串形式如“level、noon、civic”，而“gotogo”不是，但如果我们把“gotogo”分为“go”、“to”、“go”三段，则可以认为“go to go”是段式回文

给定一个字符串s（s仅由小写英文字母组成，且s长度<= 30），请将s分割成一些子串，使每个子串都是段式回文。返回s所有可能的分割方案的个数

例如gotogo，可有6种分隔方案，即：[g, o, t, o, g, o], [g, o, t, ogo], [g, oto, g, o], [g, otogo], [gotog, o], [gotogo]
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    /* Write Code Here */
    public int partitionNumber(String text) {
        int res = 0,len = text.length(),pre = 0,cur =1;
        if(len == 1){
            return 1;
        }
        while(cur<len/2){
            if(text.substring(pre,cur).equals(text.substring(len-cur,len-pre))){
                res+=2;
                pre=cur;
            }
            cur++;
        }
        if(len%2==1 || pre<len/2){
            res++;
        }
        return res;
    }

    public static class Main {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int res;

            String _text;
            try {
                _text = in.nextLine();
            } catch (Exception e) {
                _text = null;
            }

            res = new Solution().partitionNumber(_text);
            System.out.println(String.valueOf(res));

        }
}


}
