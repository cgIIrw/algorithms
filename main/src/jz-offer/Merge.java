// 合并两个排序的链表

public class Merge {
  public static ListNode merge(ListNode list1,ListNode list2) {
    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    ListNode headNode = null;
    if (list1.val < list2.val) {
      headNode = list1;
      list1.next = merge(list1.next, list2);
    } else {
      headNode = list2;
      list2.next = merge(list1, list2.next);
    }
    return headNode;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(3);
    ListNode c = new ListNode(5);
    ListNode d = new ListNode(7);
    a.next = b;
    b.next = c;
    c.next = d;
    ListNode a02 = new ListNode(2);
    ListNode b02 = new ListNode(4);
    ListNode c02 = new ListNode(6);
    ListNode d02 = new ListNode(8);
    a02.next = b02;
    b02.next = c02;
    c02.next = d02;
    ListNode out = merge(a, a02);
    System.out.println(out.val);
    System.out.println(out.next.val);
    System.out.println(out.next.next.val);
    // 不要重复在打印语句中调用merge()
    // System.out.println(merge(a, a02).next.next.val);
  }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
