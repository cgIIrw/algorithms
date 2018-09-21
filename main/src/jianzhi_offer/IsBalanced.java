package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 哈维 输入二叉树的根节点，判断该树是不是平衡二叉树
 */
public class IsBalanced {
    public static boolean flag = true;

    public static boolean isBalanced(BinaryTreeNode node) {
        depth(node);
         return flag;
    }

    public static int depth(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);
        if (leftDepth - rightDepth > 1 || leftDepth - rightDepth < -1) {
            flag = false;
        }

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(3);
        root.right.right = new BinaryTreeNode(6);
        root.left = new BinaryTreeNode(2);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.left.right.left = new BinaryTreeNode(7);

        System.out.println(isBalanced(root));

    }
}
