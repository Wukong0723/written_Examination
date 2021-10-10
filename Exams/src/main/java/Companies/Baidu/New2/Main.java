package Companies.Baidu.New2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String[] strings = new String[n];
        for(int i = 0;i<n;i++){
            strings[i] = func(sc.nextLine());
        }
        for(int i = 0;i<n;i++){
            System.out.println(func(strings[i]));
        }
    }
    static String func(String str){
        if(str.length()<2){
            if(str.charAt(0)-'2'>0){
                return "3";
            }else {
                return str;
            }
        }

        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)-'3'>0){
                flag =1;
                sb.append('3');
            }else if(str.charAt(i) != '0'){
                if(flag == 1){
                    sb.append('3');
                }else{
                    //flag =0;
                    sb.append(str.charAt(i));
                }
            }else{
                if(sb.charAt(sb.length()-1) == '1'){
                    flag =1;
                    int pos =sb.length()-1;
                    while (pos>=0 && sb.charAt(pos) == '1'){
                        pos--;
                    }
                    if(pos < 0){
                        int len = sb.length();
                        sb.delete(0,len);
                        len--;
                        while(len>0){
                            sb.append('3');
                            len--;
                        }
                        sb.append('3');
                    }else{
                        int len = sb.length()-1;
                        char tmp = sb.charAt(len);
                        sb.deleteCharAt(len);
                        sb.append(tmp-1);
                        sb.append('3');
                    }

                }else{
                    if(flag == 0){
                        char lastChar = sb.charAt(sb.length()-1);
                        sb.deleteCharAt(sb.length()-1);
                        sb.append(lastChar == '3' ? '2':'1');
                        sb.append('3');
                        flag =1;
                    }else{
                        sb.append('3');
                    }

                }
            }
        }

        return sb.toString();
    }

}
