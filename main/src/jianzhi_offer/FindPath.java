package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 阿比达尔 二叉树中和为某一值的路径
 */
public class FindPath {


    List<LinkedList<Integer>> lists = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public void findpath(BinaryTreeNode root, int sum) {
        if (root == null) {
            return;
        }

        list.add(root.value);

        if (root.value == sum && root.right == null && root.left == null) {
            // 深拷贝
            lists.add(new LinkedList<>(list));
        } else {
            findpath(root.left, sum - root.value);
            findpath(root.right, sum - root.value);
        }
        list.pollLast();
    }

    public void getList() {
        for (LinkedList<Integer> i : lists) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        BinaryTreeNode root = new BinaryTreeNode(10);
        root.left = new BinaryTreeNode(5);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(12);

        FindPath findPath = new FindPath();
        findPath.findpath(root, 22);
        findPath.getList();
    }
}

