package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 马奎斯 重建二叉树
 */
public class ReConstructBinaryTree {

    public static BinaryTreeNode reConstructBinaryTree(int[] l1, int head01, int tail01,
                                                       int[] l2, int head02, int tail02) {
        if (l1 == null || l2 == null || l1.length != l2.length || l1.length <= 0) {
            return null;
        }

        // 这里约定当head < 0 || tail > l.length - 1的时候数组为空；
        if (head01 < 0 || tail01 > l1.length - 1
                || head02 < 0 || tail02 > l2.length - 1
                || head01 > tail01 || head02 > tail02) {
            return null;
        }

        int temp = 0;
        for (int i = head02; i <= tail02; i++) {
            if (l1[head01] == l2[i]) {
                temp = i;
                break;
            } else if (i == tail01) {
                return null;
            }
        }

        BinaryTreeNode root = new BinaryTreeNode(l1[head01]);
        root.left = reConstructBinaryTree(l1, head01 + 1, head01 + temp - head02,
                l2, head02, temp - 1);
        root.right = reConstructBinaryTree(l1, head01 + temp - head02 + 1, tail01,
                l2, temp + 1, tail02);

        return root;
    }

    public static void main(String[] args) {
        int[] a = new int[] {3, 9, 20, 15, 7};
        int[] b = new int[] {9, 3, 15, 20, 7};
        BinaryTreeNode node = reConstructBinaryTree(a, 0, 4, b, 0, 4);
        System.out.println(node.value);
        System.out.println(node.left.value);
        System.out.println(node.right.value);
        System.out.println(node.right.left.value);
        System.out.println(node.right.right.value);
    }
}


