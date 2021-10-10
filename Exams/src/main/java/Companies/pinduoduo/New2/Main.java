package Companies.pinduoduo.New2;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<String> arr = new ArrayList<>();
        for(int i =0 ;i<T;i++){
            arr.add(sc.nextLine());
        }
        ArrayList<String> res = orderStr(arr);

        for(int i =0;i<T;i++){
            System.out.println(res.get(i));
        }
    }

    private static ArrayList<String> orderStr(ArrayList<String> arr) {
        ArrayList<String> convertRes = new ArrayList<>();
        for(int i =0;i<arr.size();i++){
            char[] cur =arr.get(i).toCharArray();
            int len =cur.length;
            for (int j = 0 ;j<len/2;j++){
                if(cur[j] > cur[len-j-1]){
                    char tmp = cur[j];
                    cur[j] = cur[len-j-1];
                    cur[len-j-1]  = tmp;
                }
            }
            convertRes.add(String.copyValueOf(cur));
        }

        for(int i = 0;i<arr.size()-1;i++){
            for(int j=i;j<arr.size();j++){
                if(comp(convertRes.get(i),convertRes.get(j))){
                    String convertTmp = convertRes.get(i);
                    convertRes.set(i,convertRes.get(j));
                    convertRes.set(j,convertTmp);

                    String arrTmp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,arrTmp);
                }
            }
        }

        return arr;
    }
    public static boolean comp(String A,String B){
        int left = 0,right = 0;
        while(left <A.length() && right <B.length()){
            if(A.charAt(left)<B.charAt(left)){
                return false;
            }else if(A.charAt(left)>B.charAt(left)){
                return  true;
            }
            left++;
            right++;
        }
        if(A.length() == B.length()){
            return false;
        }else {
            return A.length() >= B.length();
        }
    }

}