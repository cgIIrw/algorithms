package jianzhi_offer;

import jianzhi_offer.tree_struct.ListNode;

/**
 *福贾 链表中倒数第k个节点
 */
public class FindKthToTail {

    public static ListNode FindKthToTail(ListNode node, int k) {

        if (node == null || k <= 0) {
            return null;
        }

        int n = 0;
        ListNode knode = node;
        ListNode tempNode = node;

        while (tempNode != null) {
            n++;
            if (n >= k) {
                knode = node;
                node = node.next;

            }
            tempNode = tempNode.next;
        }

        if (k > n) {
            return null;
        }
        return knode;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(10);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;

        System.out.println(FindKthToTail(l1, 0));
    }
}
