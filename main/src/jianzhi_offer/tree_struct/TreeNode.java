package jianzhi_offer.tree_struct;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;

public class TreeNode {

    public int value;
    public ArrayList<TreeNode> children = new ArrayList<>();
    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }
}
