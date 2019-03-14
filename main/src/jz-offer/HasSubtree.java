// 树的子结构
// 树root的值相同，左子树的root值相同，右子树的root值相同，
// 这是迭代点
/**
 *       7        5
 *     5  4     6   3
 *   6  3
 */
public class HasSubtree {
  public static boolean hasSubtree(TreeNode root1, TreeNode root2) {
    if (root1 == null || root2 == null) {
      return false;
    }
    return assistMethod(root1, root2) || hasSubtree(root1.left, root2)
      || hasSubtree(root1.right, root2);
  }

  private static boolean assistMethod(TreeNode r1, TreeNode r2) {
    // 这两个if的顺序不能颠倒！！
    if (r2 == null) {
      return true;
    }

    if (r1 == null) {
      return false;
    }

    if (r1.val != r2.val) {
      return false;
    } else {
      return assistMethod(r1.right, r2.right)
        && assistMethod(r1.left, r2.left);
    }
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
    System.out.println(hasSubtree(a, b));
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
