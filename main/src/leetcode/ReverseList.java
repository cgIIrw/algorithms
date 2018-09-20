package leetcode;

import leetcode.ListNode;

/**
 * Created by yin on 18/5/3.
 * 反转一个单链表。
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = null;
        System.out.println(a);
        System.out.println(reverseList(a));
    }
}


