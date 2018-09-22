package jianzhi_offer;

import java.util.Stack;

/**
 * 普约尔 包含min函数的栈
 */
public class StackWithMin {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(Integer integer) {
        stack.push(integer);

        if (!minStack.isEmpty()) {
            minStack.push(integer >= minStack.peek() ? minStack.peek() : integer);
        } else {
            stack.push(integer);
            minStack.push(integer);
        }
    }

    public Integer pop() {
        minStack.pop();
        return stack.pop();
    }

    public Integer min() {
        return minStack.isEmpty() ? null : minStack.peek();
    }

    public static void main(String[] args) {
        StackWithMin stackWithMin = new StackWithMin();
       stackWithMin.push(4);
        stackWithMin.push(2);
        stackWithMin.push(3);
        stackWithMin.push(2);
        stackWithMin.push(5);
        stackWithMin.pop();
        stackWithMin.pop();
        stackWithMin.pop();
        stackWithMin.pop();
        System.out.println(stackWithMin.min());
    }
}
