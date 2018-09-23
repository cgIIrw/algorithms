package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

import java.util.Stack;

/**
 * 阿尔维斯 按之字形顺序打印二叉树
 */
public class PrintZ {

    public static void printZ(BinaryTreeNode node) {
        if (node == null) {
            return;
        }

        Stack<BinaryTreeNode> stack01 = new Stack<>();
        Stack<BinaryTreeNode> stack02 = new Stack<>();
        stack01.push(node);

        while (!stack01.isEmpty()) {
            while (!stack01.isEmpty()) {

                BinaryTreeNode pop01 = stack01.pop();
                System.out.println(pop01.value);
                if (pop01.left != null) {
                    stack02.push(pop01.left);
                }
                if (pop01.right != null) {
                    stack02.push(pop01.right);
                }
            }

            while (!stack02.isEmpty()) {
                BinaryTreeNode pop02 = stack02.pop();
                System.out.println(pop02.value);
                if (pop02.right != null) {
                    stack01.push(pop02.right);
                }
                if (pop02.left != null) {
                    stack01.push(pop02.left);
                }
            }
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
        root.right.right.right = new BinaryTreeNode(1);
        root.right.right.left = new BinaryTreeNode(2);
        root.right.left.right = new BinaryTreeNode(3);
        root.right.left.left = new BinaryTreeNode(4);

        printZ(root);
    }
}
