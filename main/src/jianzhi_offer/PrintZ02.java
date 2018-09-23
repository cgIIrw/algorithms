package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 本例为了满足编程网站的提交；
 */
public class PrintZ02 {
    public static ArrayList<ArrayList<Integer>> printZ(BinaryTreeNode node) {
        if (node == null) {
            return new ArrayList<ArrayList<Integer>>();
        }

        Stack<BinaryTreeNode> stack01 = new Stack<>();
        Stack<BinaryTreeNode> stack02 = new Stack<>();
        stack01.push(node);
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> list = null;

        while (!stack01.isEmpty()) {
            list = new ArrayList<>();
            while (!stack01.isEmpty()) {

                BinaryTreeNode pop01 = stack01.pop();
                list.add(pop01.value);
                if (pop01.left != null) {
                    stack02.push(pop01.left);
                }
                if (pop01.right != null) {
                    stack02.push(pop01.right);
                }
            }
            if (!list.isEmpty())
            ret.add(new ArrayList<Integer>(list));
            list = new ArrayList<>();
            while (!stack02.isEmpty()) {

                BinaryTreeNode pop02 = stack02.pop();
                list.add(pop02.value);
                if (pop02.right != null) {
                    stack01.push(pop02.right);
                }
                if (pop02.left != null) {
                    stack01.push(pop02.left);
                }
            }
            if (!list.isEmpty())
            ret.add(new ArrayList<Integer>(list));
        }
        return ret;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(8);
        root.right = new BinaryTreeNode(14);
        root.right.left = new BinaryTreeNode(12);
        root.right.right = new BinaryTreeNode(16);
//        root.right.right.right = new BinaryTreeNode(1);
//        root.right.right.left = new BinaryTreeNode(2);
//        root.right.left.right = new BinaryTreeNode(3);
//        root.right.left.left = new BinaryTreeNode(4);

        System.out.println(printZ(null));
    }
}
