package jianzhi_offer;
import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 哈维 二叉树的深度
 */
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
        root.right = new BinaryTreeNode(3);
        root.right.right = new BinaryTreeNode(6);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.left.right.left = new BinaryTreeNode(7);

        System.out.println(treeDepth(root));
    }
}
