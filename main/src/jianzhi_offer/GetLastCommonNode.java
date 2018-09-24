package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 罗本 树中两个节点的最低公共祖先(二叉搜索树版本)
 */
public class GetLastCommonNode {

    // 本题首先考虑提供的树是二叉搜索树的情况

    public static BinaryTreeNode getLastCommonNode(BinaryTreeNode node,
                                                   BinaryTreeNode inputNode01,
                                                   BinaryTreeNode inputNode02) {
        if (node == null) {
            return null;
        }

        if (node.value > inputNode01.value && node.value > inputNode02.value) {
            return getLastCommonNode(node.left, inputNode01, inputNode02);
        } else if (node.value < inputNode01.value && node.value < inputNode02.value){
            return getLastCommonNode(node.right, inputNode01, inputNode02);
        }

        return node;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(8);
        root.right = new BinaryTreeNode(14);
        root.right.left = new BinaryTreeNode(12);
        root.right.right = new BinaryTreeNode(16);

        BinaryTreeNode node = getLastCommonNode(root, root.left.left, root.right.left);
        System.out.println(node.value);

    }
}
