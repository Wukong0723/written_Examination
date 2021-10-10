package Companies.Citrix.New1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1,输入字符串数量，每行一个
        int n = Integer.parseInt(sc.nextLine());
        String[] res = new String[n];
        for(int i =0;i<n;i++){
            res[i] = sc.nextLine();
        }
        System.out.println(Arrays.asList(res));
        //2,只输入一行，几个字符串用空格隔开
        String[] res2 = sc.nextLine().split(" ");
        System.out.println(Arrays.asList(res2));

    }


    public static String compareStrings(String firstString, String secondString, String thirdString) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        PriorityQueue<String> que = new PriorityQueue<>();
        que.offer(firstString);
        que.offer(secondString);
        que.offer(thirdString);
        sb.append(que.poll());
        sb.append(que.poll());
        sb.append(que.poll());
        return sb.toString();
    }
}
