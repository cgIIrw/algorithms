// 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
import java.util.Stack;
public class MyQueue {
  // stack1是进端
  Stack<Integer> stack1 = new Stack<Integer>();
  // stack2是出端
  Stack<Integer> stack2 = new Stack<Integer>();

  public void push(int node) {
    stack1.push(node);

  }

  public int pop() {
    if (stack1.isEmpty() && stack2.isEmpty()) {
      throw new RuntimeException("出错!");
    }

    if (stack2.isEmpty()) {
      while(!stack1.isEmpty())
        stack2.push(stack1.pop());
    }
    return stack2.pop();
  }
  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.push(3);
    queue.push(4);
    System.out.println(queue.pop());
    queue.push(5);
    System.out.println(queue.pop());
    System.out.println(queue.pop());

  }
}
