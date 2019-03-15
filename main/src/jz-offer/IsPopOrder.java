// 栈的压入、弹出序列 12345 45321
// 采用一个辅助栈，该辅助栈和弹出的序列就似
// 消消乐一般
import java.util.Stack;
public class IsPopOrder {
  public static boolean isPopOrder(int [] pushA,int [] popA) {
    Stack<Integer> temp = new Stack<>();

    int count = 0;
    for (int i = 0; i < pushA.length; i++) {
      temp.push(pushA[i]);
      // while应考虑循环完全后的情况
      while(!temp.isEmpty() && temp.peek() == popA[count]) {
        temp.pop();
        count++;
      }
    }
    return temp.isEmpty();
  }

  public static void main(String[] args) {
    int[] arr01 = new int[]{1, 2, 3, 4, 5};
    int[] arr02 = new int[]{4, 5, 3, 2, 1};
    System.out.println(isPopOrder(arr01, arr02));
  }
}
