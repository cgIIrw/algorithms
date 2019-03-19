// 二叉搜索树的第k个节点
import java.util.ArrayList;
public class KthNode {
  static TreeNode kthNode(TreeNode pRoot, int k) {
    if (pRoot == null || k < 1) {
      return null;
    }

    ArrayList<TreeNode> out = search(pRoot);
    if (k > out.size()) {
      return null;
    }
    return out.get(k - 1);
  }

  private static ArrayList<TreeNode> search(TreeNode node) {
    if (node == null) {
      return new ArrayList<>();
    }
    ArrayList<TreeNode> list = search(node.left);
    list.add(node);
    list.addAll(search(node.right));
    return list;
  }

  public static void main(String[] args) {
      TreeNode a = new TreeNode(7);
      TreeNode b = new TreeNode(4);
      TreeNode c = new TreeNode(1);
      TreeNode d = new TreeNode(6);
      TreeNode e = new TreeNode(8);
      a.left = b;
      b.left = c;
      b.right = d;
      a.right = e;
      System.out.println(kthNode(a, 6).val);
      // System.out.println(kthNode(null, 3).val);
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
