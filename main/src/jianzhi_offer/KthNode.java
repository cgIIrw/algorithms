package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 德科 二叉搜索树的第K个节点
 */
public class KthNode {

    private int k;
    private int count = 0;
    private BinaryTreeNode target;

    private void find(BinaryTreeNode node) {
        if (node == null) {
            return;
        }

        find(node.left);
        count++;
        if (count == k) {
            target = node;
        }

        find(node.right);
    }

    public BinaryTreeNode findK(BinaryTreeNode node, int k) {
        this.k = k;
        find(node);
        // 考虑复用，变量使用一次后归位
        count = 0;
        BinaryTreeNode temp = target;
        target = null;
        return temp;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(8);
        root.right = new BinaryTreeNode(14);
        root.right.left = new BinaryTreeNode(12);
        root.right.right = new BinaryTreeNode(16);

        KthNode kthNode = new KthNode();
        System.out.println(kthNode.findK(root, 1).value);
        System.out.println(kthNode.findK(root, 2).value);
        System.out.println(kthNode.findK(root, 3).value);
        System.out.println(kthNode.findK(root, 4).value);
        System.out.println(kthNode.findK(root, 5).value);
        System.out.println(kthNode.findK(root, 6).value);
        System.out.println(kthNode.findK(root, 99));
    }
}
