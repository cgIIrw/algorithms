import java.util.ArrayList;
public class PrintListFromTailToHead {
  public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    if (listNode == null) {
      return new ArrayList<Integer>(); // 记得这里返回的对象
    }
    ArrayList<Integer> arr = new ArrayList<>();
     arr.addAll(printListFromTailToHead(listNode.next));
     arr.add(listNode.val);
    return arr;
  }

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    ListNode b = new ListNode(2);
    ListNode c = new ListNode(3);
    ListNode d = new ListNode(4);
    a.next = b;
    b.next = c;
    c.next = d;
    ArrayList<Integer> arr = printListFromTailToHead(a);
    System.out.println(arr);

  }
}

class ListNode {
  int val;
  ListNode next = null;
  ListNode(int val) {
    this.val = val;
  }
}
