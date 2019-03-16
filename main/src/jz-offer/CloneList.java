// 复杂链表的复制
// 算是一个深度复制
//         ________
//        /         \
//   1 -> 2 -> 3 -> 5
//    \_______/
public class CloneList {
  public static RandomListNode cloneList(RandomListNode pHead) {
    if (pHead == null) {
      return null;
    }

    // 复制node
    RandomListNode ori = pHead;
    while(ori.next != null) {
      RandomListNode cop = new RandomListNode(ori.label);
      cop.next = ori.next;
      ori.next = cop;
      ori = ori.next.next;
    }
    RandomListNode cop = new RandomListNode(ori.label);
    ori.next = cop;

    // 复制random链接
    RandomListNode randOri = pHead;
    while(randOri != null) {
      if (randOri.random != null) {
        randOri.next.random = randOri.random.next;
      }
      randOri = randOri.next.next;
    }

    // 拆分
    RandomListNode node01 = pHead;
    RandomListNode node02 = pHead.next;
    RandomListNode returnNode = pHead.next;

    while(node02.next != null) {
      node01.next = node01.next.next;
      node01 = node01.next;
      node02.next = node02.next.next;
      node02 = node02.next;
    }
    node01.next = null;
    return returnNode;
  }

  public static void main(String[] args) {
    RandomListNode a = new RandomListNode(1);
    RandomListNode b = new RandomListNode(2);
    RandomListNode c = new RandomListNode(3);
    RandomListNode d = new RandomListNode(5);
    a.next = b;
    b.next = c;
    c.next = d;
    a.random = c;
    b.random = d;
    RandomListNode out = cloneList(a);
    System.out.println(out.label);
    System.out.println(out.next.random.label);
    System.out.println(out.next.next.label);
    System.out.println(out.random.label);
  }
}

class RandomListNode {
  int label;
  RandomListNode next = null;
  RandomListNode random = null;

  RandomListNode(int label) {
      this.label = label;
  }
}
