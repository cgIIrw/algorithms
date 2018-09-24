package jianzhi_offer;

import java.util.LinkedList;
import java.util.List;

/**
 * 罗本 滑动窗口的最大值
 */
public class MaxInWindows {

    public static List<Integer> maxInWindows(int[] num, int k) {
        if (num == null || k<= 0 || num.length < k) {
            return null;
        }

        // 用来缓存最大值
        LinkedList<Integer> list = new LinkedList<>();
        // 用来保存最大值
        LinkedList<Integer> ret = new LinkedList<>();

        for (int i = 0; i < num.length; i++) {

            if (i < 3) {
                if (!list.isEmpty() && (num[i] > (list.peekLast())))
                    list.removeLast();
                list.add(num[i]);

                // 当i为2的时候，此时已经形成第一个滑动窗口，需要
                // 添加此时的最大值到ret
                if (i == 2) {
                    ret.add(list.peekFirst());
                }
            }

            if (i >= 3) {

                // 每滑动一格，相应的原本的滑动窗口最左边的数就要
                // 移出，此时要判断缓存list里面最大的数是不是该移出的数
                if (num[i - 3] == list.peekFirst()) {
                    list.removeFirst();
                }

                if (num[i] <= (list.peekLast())) {
                    list.add(num[i]);
                } else if (num[i] > (list.peekLast())) {
                    while (list.size() != 0 && num[i] > (list.peekLast()))
                        list.removeLast();
                    list.add(num[i]);
                }
                ret.add(list.peekFirst());
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        int[] input = new int[]{2, 3, 4, 2, 6, 2, 5, 1};
        int k = 3;
        System.out.println(maxInWindows(input, k));
    }
}
