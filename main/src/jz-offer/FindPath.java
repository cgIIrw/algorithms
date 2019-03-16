// 二叉树中和为某一值的路径
import java.util.ArrayList;
public class FindPath {
    private static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    private static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
        if (root == null) {
            return lists;
        }

        list.add(root.val);

        if (root.val == target && root.left == null && root.right == null) {
            lists.add(new ArrayList<>(list));
        } else {
            findPath(root.left, target - root.val);
            findPath(root.right, target - root.val);
        }
        list.remove(list.size() - 1);
        return lists;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(7);
        TreeNode b = new TreeNode(5);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(2);
        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        TreeNode w = new TreeNode(15);
        System.out.println(findPath(a, 15));
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
