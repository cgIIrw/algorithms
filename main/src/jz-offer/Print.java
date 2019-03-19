// 按之字形顺序打印二叉树
import java.util.*;
public class Print {
  public static ArrayList<ArrayList<Integer> > print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer>> out = new ArrayList<>();
    if (pRoot == null) {
      return out;
    }
    ArrayList<Integer> list = new ArrayList<>();
    LinkedList<TreeNode> queue = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    queue.offer(pRoot);

    do {
      while(queue.peek() != null) {
        TreeNode node = queue.poll();
        list.add(node.val);
        if (node.left != null)
          stack.add(node.left);
        if (node.right != null)
          stack.add(node.right);
      }
      out.add(list);
      list = new ArrayList<>();

      if (stack.empty()) {
        continue;
      }

      while(!stack.empty()) {
        TreeNode node = stack.pop();
        list.add(node.val);
        if (node.right != null)
          // 这里要注意添加的方式和顺序
          queue.addFirst(node.right);
        if (node.left != null)
          queue.addFirst(node.left);
      }
      out.add(list);
      list = new ArrayList<>();
    } while (queue.peek() != null);

    return out;
  }

  public static void main(String[] args) {
    /**
     *       7
     *     5   4
     *   6  3 9 10
     */
    TreeNode a = new TreeNode(7);
    TreeNode b = new TreeNode(5);
    TreeNode c = new TreeNode(4);
    TreeNode d = new TreeNode(6);
    TreeNode e = new TreeNode(3);
    TreeNode f = new TreeNode(9);
    TreeNode g = new TreeNode(10);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;
    System.out.println(print(a));
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
