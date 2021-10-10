package Companies.HuaWei.New2;

import org.w3c.dom.Node;

import java.util.*;

public class Main {
    static class Node {
        String name;
        List<Node> pre;
        List<Node> next;

        Node() {
        }

        Node(String name, Node pre, Node next) {
            this.name = name;
            this.pre.add(pre);
            this.next.add(next);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String target = sc.nextLine();
        String[] relation = new String[n];
        for (int i = 0; i < n; i++) {
            relation[i] = sc.nextLine();
        }
        System.out.println(maxLen(n, relation, target));

    }

    static int maxLen(int n, String[] relation, String target) {
        HashMap<String, Node> mp = new HashMap<>();
        for (int i = 0; i < relation.length; i++) {
            String[] cur = relation[i].split(" ");
            Node curNode = ifExist(cur[0], mp);
            Node preNode = ifExist(cur[1], mp);
            Node nextNode = ifExist(cur[2], mp);
            if (preNode.name != "null") {
                curNode.pre.add(preNode);
            }
            if (nextNode.name != "null") {
                curNode.next.add(nextNode);
            }
        }
        int MAX_CNT = 0;
        Node targetNode = mp.get(target);
        int a =dfsPre(targetNode);
        int b =dfsNext(targetNode);
        return dfsPre(targetNode)+dfsNext(targetNode)-1;

    }

    static int dfsPre(Node root){
        if(root == null || root.name.equals("null") ){
            return 0;
        }else{
            int MAX_CNT = 0;
            for(Node tmp: root.pre){
                MAX_CNT = Math.max(MAX_CNT,dfsPre(tmp));
            }
            return MAX_CNT+1;
        }
    }
    static int dfsNext(Node root){
        if(root == null || root.name.equals("null")){
            return 0;
        }else{
            int MAX_CNT = 0;
            for(Node tmp: root.next){
                MAX_CNT = Math.max(MAX_CNT,dfsNext(tmp));
            }
            return MAX_CNT+1;
        }
    }

    static Node ifExist(String tmp, HashMap<String, Node> mp) {
        if (mp.containsKey(tmp)) {
            return  mp.get(tmp);
        } else {
            Node curNode = new Node();
            curNode.name = tmp;
            curNode.pre = new ArrayList<>();
            curNode.next = new ArrayList<>();
            mp.put(tmp,curNode);
            return curNode;
        }
    }
}
