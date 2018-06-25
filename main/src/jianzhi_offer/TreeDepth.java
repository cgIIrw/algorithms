package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

public class TreeDepth {

    public static int treeDepth(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftNode = treeDepth(root.left);
        int rightNode = treeDepth(root.right);

        return leftNode > rightNode ? leftNode + 1 : rightNode + 1;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.left.left = new BinaryTreeNode(3);

        System.out.println(treeDepth(root));
    }
}
