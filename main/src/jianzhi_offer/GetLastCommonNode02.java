package jianzhi_offer;

import jianzhi_offer.tree_struct.TreeNode;

import java.util.LinkedList;

/**
 * 罗本 树中两个节点的最低公共祖先(非二叉树版本)
 */
public class GetLastCommonNode02 {

    private static LinkedList<TreeNode> l1 = new LinkedList<>();
    private static LinkedList<TreeNode> l2 = new LinkedList<>();
    static boolean flag = false;

    public static void addPath(TreeNode root, TreeNode node, LinkedList<TreeNode> l) {
        if (root == null) {
            return;
        }
        if (root == node) {
            l.add(root);
            flag = true;
            return;
        }

//        l.add(root);
        if (!root.children.isEmpty()) {
            l.add(root);
            for (TreeNode child : root.children) {
                if (flag == false)
                    addPath(child, node, l);
            }

            if (flag == false) {
                l.removeLast();
            }
        }
//        } else {
//            flag = false;
//            l.removeLast();
//        }
    }

    public static void main(String[] args) {

        //             1
        //           /   \
        //         2      3
        //        /         \
        //      4            5
        //     / \        /  |  \
        //    6   7      8   9  10
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);

        n1.children.add(n2);
        n1.children.add(n3);

        n2.children.add(n4);

        n4.children.add(n6);
        n4.children.add(n7);

        n3.children.add(n5);

        n5.children.add(n8);
        n5.children.add(n9);

        addPath(n1, n8, l1);
        System.out.println(l1);
    }
}
