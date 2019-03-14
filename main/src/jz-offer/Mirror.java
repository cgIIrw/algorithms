// 二叉树的镜像
/**
 *       7        7
 *     5  4     4   5
 *   6  3         3  6
 */
public class Mirror {
  public static void mirror(TreeNode root) {
    if (root == null) {
      return;
    }

    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    mirror(root.left);
    mirror(root.right);
  }



  public static void main(String[] args) {
    TreeNode a = new TreeNode(7);
    TreeNode b = new TreeNode(5);
    TreeNode c = new TreeNode(4);
    TreeNode d = new TreeNode(6);
    TreeNode e = new TreeNode(3);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    mirror(a);
    System.out.println(a.right.val);
    System.out.println(a.right.left.val);
    System.out.println(a.right.right.val);
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
