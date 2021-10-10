package Companies.ByteDance.New1;

import java.util.*;
public class Main {
    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    static int[] preorder;
    static HashMap<Integer, Integer> dic = new HashMap<>();

    static public TreeNode buildTree(int[] preorder, int[] inorder) {
        Main.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    static TreeNode recur(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = recur(root + 1, left, i - 1);
        node.right = recur(root + i - left + 1, i + 1, right);
        return node;
    }

    static boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        return  helper(left.left, right.right) && helper(left.right, right.left);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];
        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }
        TreeNode root = buildTree(preorder, inorder);
        if (helper(root.left, root.right)) {
            int pos = n-dic.get(Arrays.stream(preorder).max().getAsInt())-1;
            System.out.println(inorder[pos]);

        } else {
            System.out.println(Arrays.stream(preorder).max().getAsInt());
        }

    }
}


/*
6
3 9 1 2 20 15
1 9 2 3 15 20
 */