// 二叉树的深度
// 二叉树可以为空
public class TreeDepth {
  public static int treeDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }

    if (treeDepth(root.left) >= treeDepth(root.right)) {
      return 1 + treeDepth(root.left);
    } else {
      return 1 + treeDepth(root.right);
    }
  }

  public static void main(String[] args) {
    //         a
    //       b   c
    //     d
    TreeNode a = new TreeNode(1);
    TreeNode b = new TreeNode(2);
    TreeNode c = new TreeNode(3);
    TreeNode d = new TreeNode(4);
    a.left = b;
    a.right = c;
    b.left = d;
    System.out.println(treeDepth(a));
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
