package jianzhi_offer;

import java.util.Stack;

public class IsPopOrder {

    public static boolean isPopOrder(int[] s1, int[] s2) {
        if (s1 == null|| s2 == null || s1.length != s2.length || s1.length == 0) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        // input
        int j = 0;
        for (int i = 0; i <= s1.length && j < s2.length; i++) {
            if (stack.isEmpty() || stack.peek() != s2[j]) {
                if (i == s1.length)
                    return false;
                stack.push(s1[i]);
            } else {
                stack.pop();
                j++;
                i--;
            }
        }

        if (j < s2.length) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] s01 = new int[] {1, 2, 3, 4, 5};
        int[] s02 = new int[] {4, 5, 3, 2, 1};

        System.out.println(isPopOrder(s01, s02));
    }
}
