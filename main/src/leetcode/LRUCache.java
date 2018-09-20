package leetcode; /**
 * Created by yin on 18/5/2.
 * 实现LRU。
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int size;
    Node head;
    Node end;
    HashMap<Integer, Node> map = new HashMap<>();
    public LRUCache(int size) {
        this.size = size;
    }

    public void remove(Node node) {
        if (node.pre != null) {
            node.pre.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.pre = node.pre;
        } else {
            end = node.pre;
            end.next = null;
        }
    }

    public void setHead(Node node) {
        node.next = head;
        node.pre = null;

        if (head != null) {
            head.pre = node;
        }

        head = node;

        if (end == null) {
            end = head;
        }
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.val;
        }
        return -1;
    }

    public void set(int key, int val) {
        if (map.containsKey(key)) {
            Node old = map.get(key);
            old.val = val;
            remove(old);
            setHead(old);
        } else {
            Node newNode = new Node(val);
            if (map.size() >= size) {
                // 此时如果删除hash桶的引用，node由于还在链表上有被引用，所以不被回收
                Collection<Node> col = map.values();
                col.remove(end);
                remove(end);

                setHead(newNode);
            } else {
                setHead(newNode);
            }
            map.put(key, newNode);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Map.Entry<Integer, Node> entry : map.entrySet()) {
            s += "["+ entry.getKey() + ", " + entry.getValue().val + "]\n";
        }
        return s;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(5);
        cache.set(1, 2);
        cache.set(2, 3);
        cache.set(3, 4);
        cache.set(4, 5);
        cache.set(5, 6);
        cache.set(3, 6);
//        cache.get(3);
        cache.set(5, 9);
        cache.set(6, 7);

        System.out.println(cache);

    }
}


class Node {
    int val;
    Node pre;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}