package Companies.XiaoHongShu.New3;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class TreeNode{
        int num ;
        public List<TreeNode> childNodes ;
        public List<Integer> pathLen;
        TreeNode(){
        }
        TreeNode(int num){
            this.num = num;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(new TreeNode(0));
        for (int i = 0; i < n; i++) {
            TreeNode tmp = new TreeNode(i);
            nodeList.add(tmp);
        }
        for(int i=0;i<n-1;i++){
            int parentId = sc.nextInt();
            TreeNode cur = nodeList.get(parentId);
            cur.childNodes.add(nodeList.get(sc.nextInt()));
            cur.pathLen.add(sc.nextInt());
        }

        System.out.println(func(nodeList,n,k));

    }

    static int func(List<TreeNode> nodeList, int n,int k) {
        int res = 0;

        for(TreeNode cur :nodeList){
            res += dfs(0,cur,nodeList,k,res);
        }


        return res;
    }

    static int dfs(int curLen,TreeNode curNode,List<TreeNode> nodeList,int k,int res){
        if(curNode == null || curLen>k){
            return 0;
        }
        for(TreeNode cur : nodeList.get(curNode.num).childNodes){

        }
        return 0;
    }
}
