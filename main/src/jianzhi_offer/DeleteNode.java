package jianzhi_offer;

import jianzhi_offer.tree_struct.ListNode;

/**
 * 华金 在O(1)时间删除链表节点
 */
public class DeleteNode {


    public static ListNode deleteNode(ListNode root, ListNode target) {

        if (root == null) {
            return null;
        }

        if (root == target && root.next == null) {
            root = root.next;
            return root;
        }

        if (target.next != null) {
            ListNode temp = target.next;
            temp.val = target.next.val;
            temp.next = target.next.next;

            target.next = temp.next;
            target.val = temp.val;
        }

        if (target.next == null) {
            ListNode rootTemp = root;
            while (rootTemp != null) {
                if (rootTemp.next == target) {
                    rootTemp.next = null;
                    break;
                }
                rootTemp = rootTemp.next;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        System.out.println(deleteNode(l1, l3));
    }
}
