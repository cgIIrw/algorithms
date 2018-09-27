package jianzhi_offer;

import jianzhi_offer.tree_struct.ListNode;

/**
 * 卡卡 合并两个排序的链表
 */
public class Merge {

    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
           ListNode temp01 = l1.next;
           l1.next = merge(temp01, l2);
           return l1;
        } else {
            ListNode temp02 = l2.next;
            l2.next = merge(l1, temp02);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);

        System.out.println(merge(l1, l2));
    }
}


