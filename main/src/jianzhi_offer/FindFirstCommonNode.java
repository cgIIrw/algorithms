package jianzhi_offer;

import jianzhi_offer.tree_struct.ListNode;

public class FindFirstCommonNode {

    public static ListNode findFirstCommonNode(ListNode pHead01, ListNode pHead02) {
        int len01 = 0;
        int len02 = 0;
        ListNode node01 = pHead01;
        ListNode node02 = pHead02;

        while (node01 != null) {
            len01++;
            node01 = node01.next;
        }

        while (node02 != null) {
            len02++;
            node02 = node02.next;
        }

        node01 = pHead01;
        node02 = pHead02;

        while (len01 > len02) {
            node01 = node01.next;
        }

        while ((len01 < len02)) {
            node02 = node02.next;
        }

        while (node01 != node02 && node01 != null && node02 != null) {
            node01 = node01.next;
            node02 = node02.next;
        }

        if (node01 == null || node02 == null) {
            return null;
        }

        return node01;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node3;
        node2.next = node4;
        node3.next = node5;
        node4.next = node3;
        node5.next = node6;

        System.out.println(findFirstCommonNode(node1, node4));

    }
}
