package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 伊涅斯塔 二叉搜索树与双向链表
 */
public class ConvertBST {
    private BinaryTreeNode head;
    private BinaryTreeNode tail;

    public BinaryTreeNode convertNode(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }

        convertNode(root.left);

        if (head == null) {
            head = tail = root;
        } else {
            tail.right = root;
            root.left = tail;
            tail = root;
        }

        convertNode(root.right);
        return head;
    }

    public static void main(String[] args) {

        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(8);
        root.right = new BinaryTreeNode(14);
        root.right.left = new BinaryTreeNode(12);
        root.right.right = new BinaryTreeNode(16);

        ConvertBST ctbst = new ConvertBST();
        BinaryTreeNode binaryTreeNode = ctbst.convertNode(root);

        do {
            System.out.print(binaryTreeNode.value + " -> ");
            binaryTreeNode = binaryTreeNode.right;

        } while ( binaryTreeNode!= null);
        System.out.print("null");
    }
}
