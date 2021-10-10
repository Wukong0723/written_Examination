package Others;

import javax.management.ObjectName;
import javax.swing.text.html.parser.Entity;
import javax.swing.tree.TreeNode;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.*;

public class Linked {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        TreeNode head = new TreeNode(0);

        ArrayList<TreeNode> arr = new ArrayList<>();
        Stack<TreeNode> sta = new Stack<>();
        sta.push(head);

        while(!sta.empty()){
            TreeNode topNode = sta.peek();
            if(topNode != null){
                if(topNode.left != null){
                    sta.push(topNode.left);
                }
                if(topNode.right != null){
                    sta.push(topNode.right);
                }
            }else{
                TreeNode tmp = sta.pop();
                arr.add(tmp)
;            }
        }

    }


}
