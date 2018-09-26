package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 斯内德 树的子结构
 */
public class HasSubtree {

    public static boolean hasSubtree(BinaryTreeNode node01, BinaryTreeNode node02) {

        boolean result = fixRootHasTree(node01, node02);

        if (node01 != null) {
            if (!result)
                result = hasSubtree(node01.left, node02);

            if (!result) {
                result = hasSubtree(node01.right, node02);
            }
        }
        return result;
    }

    private static boolean fixRootHasTree(BinaryTreeNode root, BinaryTreeNode node) {
        // 实际上，第二个if如果放在前面，那么第一个if只需要判断root是否为null就可以了，
        // 不想改以后用来review吧
        if (root == null && node != null) {
            return false;
        }
        if (node == null) {
            return true;
        }

        if (root.value != node.value) {
            return false;
        }

        return fixRootHasTree(root.left, node.left) && fixRootHasTree(root.right, node.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(8);
        BinaryTreeNode t2 = new BinaryTreeNode(8);
        BinaryTreeNode t3 = new BinaryTreeNode(7);
        BinaryTreeNode t4 = new BinaryTreeNode(9);
        BinaryTreeNode t5 = new BinaryTreeNode(2);
        BinaryTreeNode t6 = new BinaryTreeNode(4);
        BinaryTreeNode t7 = new BinaryTreeNode(7);

        root.left = t2;
        root.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;
        t5.right = t7;

        BinaryTreeNode test = new BinaryTreeNode(8);
        test.left = new BinaryTreeNode(9);
        test.right = new BinaryTreeNode(2);

        System.out.println(hasSubtree(null, test));
    }
}
