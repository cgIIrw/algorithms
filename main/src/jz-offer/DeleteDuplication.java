// 删除链表中重复的节点
// 1 ->2 ->3 ->3 ->4 ->4 ->5  => 1 ->2 ->5
public class DeleteDuplication {

  public static ListNode deleteDuplication(ListNode pHead) {
    if (pHead == null) {
      return null;
    }
    ListNode out = pHead;
    int count = 0;
    while(out != null && out.next != null && out.val == out.next.val) {
      out = out.next;
      count++;
    }

    // 说明当前节点不是重复节点
    if (count < 1) {
      if (out != null) {
        out.next = deleteDuplication(out.next);
      }
      return out;
    } else { // 当前节点是重复节点时
      if (out != null) {
         ListNode realout = deleteDuplication(out.next);
         // 题目要求重复的节点不保留，将其下一个节点置null
         out.next = null;
         return realout;
      }
      return null;
    }
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(3);
    ListNode e = new ListNode(4);
    ListNode f = new ListNode(4);
    ListNode g = new ListNode(5);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    System.out.println(deleteDuplication(a).val);
    System.out.println(deleteDuplication(a).next.val);
    System.out.println(deleteDuplication(a).next.next.val);
    System.out.println(deleteDuplication(d).next);
  }
}

class ListNode {
  int val;
  ListNode next = null;

  ListNode(int val) {
      this.val = val;
  }
}
