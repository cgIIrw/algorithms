package jianzhi_offer.tree_struct;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("");
        ListNode p = this;
        while (p != null) {
            s.append(p.val + "-->");
            p = p.next;
        }
        s.append("null");
        return s.toString();
    }
}

