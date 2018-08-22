package jianzhi_offer;

import jianzhi_offer.tree_struct.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 从尾到头打印链表
 * 题目描述
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class PrintListFromTailToHead {

    public static List<Integer> printListFromTailToHead(ListNode node) {
        List<Integer> list = new ArrayList<>();

        if (node == null || node.next ==null) {
            list.add(node.val);
            return list;
        }

        list.addAll(printListFromTailToHead(node.next));
        list.add(node.val);

        return list;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        node1.next=node2;
        node2.next=node3;

        System.out.println(printListFromTailToHead(node1));
    }
}
