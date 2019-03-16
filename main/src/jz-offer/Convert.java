// 二叉搜索树与双向链表

public class Convert {
  private static TreeNode head = null;
  public static TreeNode convert(TreeNode pRootOfTree) {
    if (pRootOfTree == null) {
      return null;
    }

    TreeNode rightnode = convert(pRootOfTree.right);
    if (rightnode != null) {
      pRootOfTree.right = rightnode;
      rightnode.left = pRootOfTree;
    }

    head = convert(pRootOfTree.left);
    if (head == null) {
      head = pRootOfTree;
    } else {
      TreeNode temp = head;
      // 这里存在改进的方法，可以缓存链表的尾节点，
      // 但这里采用循环主要体现本人最原始思路
      while(temp.right != null) {
        temp = temp.right;
      }
      temp.right = pRootOfTree;
      pRootOfTree.left = temp;
    }
    return head;
  }

  public static void main(String[] args) {
    TreeNode a = new TreeNode(3);
    TreeNode b = new TreeNode(1);
    TreeNode c = new TreeNode(2);
    TreeNode d = new TreeNode(4);
    a.left = b;
    b.right = c;
    a.right = d;
    TreeNode out = convert(a);
    System.out.println(out.val);
    System.out.println(out.right.val);
    System.out.println(out.right.right.val);
    System.out.println(out.right.right.right.val);
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
