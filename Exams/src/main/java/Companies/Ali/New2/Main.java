package Companies.Ali.New2;


import java.util.*;

public class Main {
    public static class LineNode{
        int left;
        int right;
        LineNode(){

        }
        LineNode(int left ,int right){
            this.left =left ;
            this.right =right;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0;i<T;i++){
            int N= sc.nextInt();
            int M =sc.nextInt();
            ArrayList<LineNode> arr = new ArrayList<>();
            for(int j = 0;j<M;j++){
                LineNode tmp = new LineNode();
                tmp.left =sc.nextInt();
                tmp.right =sc.nextInt();
                arr.add(tmp);
            }
            System.out.println("Bob");
            System.out.println("Alice");
        }



    }


}

