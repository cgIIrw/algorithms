// 平衡二叉树
// 再次强调二叉树是可以为空的
public class IsBalanced_Solution {
  public static boolean isBalanced_Solution(TreeNode root) {
    if (root == null) {
      return true;
    }

    if (absMethod(height(root.left), height(root.right)) <= 1) {
      return true;
    } else {
      return false;
    }
  }

  private static int height(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }

    return height(root.left) > height(root.right) ?
      height(root.left) + 1 : height(root.right) + 1;
  }

  private static int absMethod(int a, int b) {
    if (a >= b) {
      return a - b;
    } else {
      return b - a;
    }
  }

  public static void main(String[] args) {
    //         a
    //       b   c
    //     d
    //    e
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    TreeNode d = new TreeNode(4);
    TreeNode e = new TreeNode(5);
    a.left = b;
    a.right = c;
    b.left = d;
    d.right = e;
    System.out.println(isBalanced_Solution(a));
  }
}

class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;

  public TreeNode(int val) {
      this.val = val;
  }
}
