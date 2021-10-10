package Companies.HuaWei.New1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();
        System.out.println(simpleForm(input));
    }
    static String simpleForm(String str){
        String[] strings = str.split(":");
        for(String tmp:strings){
            if(tmp.length() > 4){
                return "error";
            }
        }
        for(int i = 0;i<strings.length;i++){
            StringBuilder sb = new StringBuilder(strings[i]);
            while(sb.length()!=0 && sb.charAt(0) =='0'){
                sb.deleteCharAt(0);
            }
            if(sb.length() == 0){
                sb.append('0');
            }
            strings[i] = sb.toString();
        }

        int flag =0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].charAt(0) =='0' && flag == 0){
                if(i+1<strings.length  && strings[i+1].charAt(0) =='0'){
                    flag = 1;
                    while(i<strings.length && strings[i].charAt(0) =='0'){
                        strings[i] ="";
                        i++;
                    }
                }

            }
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0;i<strings.length;i++){
            if(strings[i] == ""){
                if(i == 0 ){
                    res.append(":");
                }
                res.append(":");
                while(i<strings.length && strings[i] == ""){
                    i++;
                }
                i--;
                if(i == strings.length-1){
                    res.append(":");
                }
            }else{
                res.append(strings[i]);
                res.append(":");
            }

        }
        res.delete(res.length()-1,res.length());
        return res.toString();
    }
}

/*
1000:0000:3238:0000:0000:1000:0000:0000
 */