/**
 * Created by yin on 18/5/2.
 *给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MaxDepth {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return maxDepth(root.left) > maxDepth(root.right) ? maxDepth(root.left) + 1 :
                maxDepth(root.right) + 1;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        System.out.println(maxDepth(a));
    }
}

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int x) {
        this.val = x;
    }
}