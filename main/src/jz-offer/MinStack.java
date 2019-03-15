// 包含min函数的栈
import java.util.Stack;
public class MinStack {
  private Stack<Integer> stack = new Stack<>();
  private Stack<Integer> min = new Stack<>();
  public void push(int node) {
    stack.push(node);
    if (min.isEmpty()) {
      min.push(node);
    } else {
      int temp = min.peek() <= node? min.peek() : node;
      min.push(temp);
    }
  }

  public void pop() {
    stack.pop();
    min.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int min() {
    return min.peek();
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(4);
    minStack.push(3);
    minStack.push(5);
    minStack.push(7);
    System.out.println(minStack.min());
    minStack.pop();
    System.out.println(minStack.top());
    minStack.push(2);
    System.out.println(minStack.min());
  }
}
