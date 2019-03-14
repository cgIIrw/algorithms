// 反转链表
// 递归法
public class ReverseList {
  public static ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode nex = head.next;
    ListNode newHead = reverseList(nex);
    ListNode temp = newHead;
    // 这里的while是为了拿到最尾端的node，但是在这里
    // 可以直接通过head.next拿到
    while(temp.next != null) {
      temp = temp.next;
    }
    temp.next = head;
    head.next = null;
    return newHead;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    a.next = b;
    b.next = c;
    c.next = d;
    System.out.println(reverseList(a).next.next.next.val);

  }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
