package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 德科 从上往下打印二叉树
 */
public class PrintFromTopToBottom {

    public static void printFromTopToBottom(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode first = queue.poll();
            System.out.println(first.value);

            // 考虑鲁棒性
            if (first.left != null)
            queue.add(first.left);
            if (first.right != null)
            queue.add(first.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(8);
        root.right = new BinaryTreeNode(14);
        root.right.left = new BinaryTreeNode(12);
        root.right.right = new BinaryTreeNode(16);

        printFromTopToBottom(root);
    }
}
