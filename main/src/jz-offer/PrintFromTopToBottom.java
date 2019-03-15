// 从上往下打印二叉树
// queue中根节点的放进放出，分别在循环外循环内
/**
 *       7
 *     5  4
 *   6  3
 */
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class PrintFromTopToBottom {
  public static ArrayList<Integer> printFromTopToBottom(TreeNode root) {
    ArrayList<Integer> out = new ArrayList<>();
    // LinkedList可以是一个Queue
    Queue<TreeNode> temp = new LinkedList<>();
    temp.offer(root);
    TreeNode node = null;
    while((node = temp.poll()) != null) {
      out.add(node.val);
      if (node.left != null) {
        temp.offer(node.left);
      }
      if (node.right != null) {
        temp.offer(node.right);
      }
    }
    return out;
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
    System.out.println(printFromTopToBottom(a));
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
