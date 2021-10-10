package Companies.JingDong.New2;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    static int liveHost;
    static int[] service;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int q = sc.nextInt();
        service = new int[n+1];
        liveHost = 0;
        ArrayList[] start =new ArrayList[n+1];
        ArrayList[] stop = new ArrayList[n+1];
        for(int i = 1;i<=n;i++){
            start[i] = new ArrayList<Integer>();
            stop[i] = new ArrayList<Integer>();
        }
        for(int i = 1;i<=n;i++){
            int c = sc.nextInt();
            for(int j = 0;j<c;j++){
                int b = sc.nextInt();
                start[i].add(b);
                stop[b].add(i);
            }
        }
        for(int i = 0;i<q;i++){
            if(sc.nextInt() == 1){
                dfsStart(n,start,sc.nextInt());
            }else{
                dfsStop(n,stop,sc.nextInt());
            }
            if(i == q-1){
                System.out.print(liveHost);
            }else{
                System.out.println(liveHost);
            }
        }
    }
    static void dfsStart(int n, ArrayList[] start,int cur){
        if(service[cur] == 1){
            return ;
        }
        if(service[cur] == 0){
            service[cur] = 1;
            liveHost++;
        }
        for(Object i:start[cur]){
            dfsStart(n,start,(Integer) i);
        }
    }
    static void dfsStop(int n, ArrayList[] stop,int cur){
        if(service[cur] == 0){
            return ;
        }
        if(service[cur] == 1){
            service[cur] = 0;
            liveHost--;
        }
        for(Object i:stop[cur]){
            dfsStop(n,stop,(Integer) i);
        }
    }
}