/**
 * Created by yin on 18/5/2.
 *
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾的）节点，
 * 您将只被给予要求被删除的节点。比如：假设该链表为 1 -> 2 -> 3 -> 4，
 * 给定您的为该链表中值为 3 的第三个节点，那么在调用了您的函数之后，该链表则应变成 1 -> 2 -> 4
 */
public class DeleteNode {
    ListNode head;
    DeleteNode(ListNode head) {
        this.head = head;
    }
    public void deleteNode(ListNode node) {
        // 如果是头节点
        if (head == node) {
            head = null;
        } else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        a.next = b;
        b.next = c;
        c.next = null;
        DeleteNode deleteNode = new DeleteNode(a);
        System.out.println(deleteNode.head.next.val);
        deleteNode.deleteNode(b);
        System.out.println(deleteNode.head.val);
        System.out.println(deleteNode.head.next.val);
    }
}

class ListNode {
    // 方便测试开放访问权限
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

/**
 * 这题关键在于,要删除的是引用的对象
 * 删除的方法无非就是:
 * 1:将指向对象的引用设为null;
 * 2.将对象改造成希望它成为的样子;
 * 原题中要删除的node规定不是尾节点,
 * 如果是,则要从头遍历找到指向它的引用
 */
