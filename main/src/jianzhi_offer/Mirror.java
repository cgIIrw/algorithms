package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 伊涅斯塔 二叉树的镜像
 */
public class Mirror {

    public void mirror(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        swap(root);

        mirror(root.left);
        mirror(root.right);
    }

    private void swap(BinaryTreeNode node) {
        BinaryTreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(3);
        root.right.right = new BinaryTreeNode(6);
        root.left = new BinaryTreeNode(2);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.left.right.left = new BinaryTreeNode(7);

        Mirror mi = new Mirror();
        mi.mirror(root);
        System.out.println(root.left.left.value);
    }
}
