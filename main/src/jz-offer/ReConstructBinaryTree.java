// 重建二叉树，输入前序遍历，中序遍历结果，假设不含重复数字
public class ReConstructBinaryTree {
  public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
    // 关于数组的算法问题，要特别注意数组长度为零的情况
    if (pre == null || in == null || pre.length != in.length || pre.length == 0) {
      return null;
    }
    int[] pre02, in02, pre03, in03;
    int i;
    TreeNode head = new TreeNode(pre[0]);

    for (i = 0; i < in.length; i++) {
      if(in[i] == pre[0])
        break;
    }

    if (i == in.length) {
      return null;
    }
    in02 = new int[i];
    pre02 = new int[i];
    in03 = new int[in.length - i - 1];
    pre03 = new int[in.length - i - 1];

    System.arraycopy(in, 0, in02, 0, i);
    System.arraycopy(in, i + 1, in03, 0, in.length -i -1);
    System.arraycopy(pre, 1, pre02, 0, i);
    System.arraycopy(pre, i + 1, pre03, 0, in.length - i -1);

    head.left = reConstructBinaryTree(pre02, in02);
    head.right = reConstructBinaryTree(pre03, in03);

    return head;
    }

  public static void main(String[] args) {
    TreeNode a = new TreeNode(3);
    TreeNode b = new TreeNode(9);
    TreeNode c = new TreeNode(20);
    TreeNode d = new TreeNode(15);
    TreeNode e = new TreeNode(7);
    a.left = b;
    a.right = c;
    c.left = d;
    c.right = e;

    TreeNode out = reConstructBinaryTree(
      new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    System.out.println(out.val);
    System.out.println(out.left.val);
    System.out.println(out.right.val);
    System.out.println(out.right.left.val);
    System.out.println(out.right.right.val);
  }
}

 // Definition for binary tree
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
