package jianzhi_offer;

import jianzhi_offer.tree_struct.BinaryTreeNode;

/**
 * 普约尔 二叉搜索树的后序遍历序列
 */
public class VertifySqurenceOfBST {

    // 题目前提是假设任意两个数字都互不相同；
    // 鲁棒性考虑多种情况 长度为0的数组，squence指向null；
    // 考虑到tail可能小于1的情况，
    public boolean vertifySqurenceOfBST(int[] squence, int head, int tail) {
        if (squence == null || squence.length == 0) {
            return false;
        }

        if ((tail - head) <= 1) return true;

        int k = squence[tail];
        int q = 0;


        // 如果这里i < tail，那么q就有可能不是大于等于k的索引，
        // 在后续程序的执行中，squence[j] < k就会成立，诸如467这样
        // 的序列会被认为不是后序遍历的列表；
        for (int i = head; i <= tail; i++) {
            q = i;
            if (squence[i] > k) {
                break;
            }
        }

        for (int j = q; j < tail; j++) {
            if (squence[j] < k) {
                return false;
            }
        }

        return vertifySqurenceOfBST(squence, head, q - 1) &&
                vertifySqurenceOfBST(squence, q, tail - 1);
    }

    public static void main(String[] args) {
        int[] ints = new int[]{7, 4};

        VertifySqurenceOfBST v = new VertifySqurenceOfBST();
        boolean b = v.vertifySqurenceOfBST(ints, 0, ints.length - 1);
        System.out.println(b);
    }
}
