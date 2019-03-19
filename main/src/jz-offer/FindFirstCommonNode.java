// 两个链表的第一个公共节点
// 这次尝试采用网上的赛车模式
public class FindFirstCommonNode {

  public static ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    if (pHead1 == null || pHead2 == null) {
      return null;
    }

    ListNode p1 = pHead1;
    ListNode p2 = pHead2;
    while(p1 != p2) {
      p1 = (p1 == null ? pHead2 : p1.next);
      p2 = (p2 == null ? pHead1 : p2.next);
    }
    return p1;
  }

  public static void main(String[] args) {
    // a -> b -> c -> d
    //      e -> c -> d
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    ListNode e = new ListNode(5);
    a.next = b;
    b.next = c;
    c.next = d;
    e.next = c;
    System.out.println(c);
    System.out.println(findFirstCommonNode(a, e));
  }
}

class ListNode {
  int val;
  ListNode next = null;

  ListNode(int val) {
    this.val = val;
  }
}
