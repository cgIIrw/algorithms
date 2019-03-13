// 链表中倒数第k个节点
public class FindKthToTail {
  public static ListNode findKthToTail(ListNode head,int k) {
    if (head == null || k <= 0) {
      return null;
    }

    ListNode before = head;
    ListNode after = head;

    for (int i = 0; i < k - 1; i++) {
      before = before.next;
      // 上下两句的顺序不能搞反
      if (before == null) {
        return null;
      }
    }

    while(before.next != null) {
      before = before.next;
      after = after.next;
    }
    return after;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    ListNode f = new ListNode(6);
    ListNode g = new ListNode(7);
    ListNode h = new ListNode(8);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    g.next = h;
    ListNode target = findKthToTail(a, 9);
    // System.out.println(target.val);
  }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
