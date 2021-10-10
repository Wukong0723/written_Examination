package Companies.ShenXinFu.New2;

import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = "I am a student.";
        int i = 0;
        String res = reverseWords(in, i);
        System.out.println(res);
    }

    static public String reverseWords(String s, int i) {
        // write code here
        if(i>=s.length()){
            return s;
        }
        String[] input = s.split(" ");
        List<String> inputList = Arrays.asList(input);
        List<String> first = inputList.subList(0,i);
        List<String> sec = inputList.subList(i,inputList.size());
        Collections.reverse(first);
        Collections.reverse(sec);
        StringBuilder sb = new StringBuilder();
        for(String str: first){
            sb.append(str);
            sb.append(" ");
        }
        for(String str: sec){
            sb.append(str);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();

    }
}