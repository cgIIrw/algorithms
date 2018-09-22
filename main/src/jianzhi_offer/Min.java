package jianzhi_offer;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 巴尔德斯 旋转数组的最小数字
 */
public class Min {
    public static int min(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException("输入错误，不存在最小数字！");
        }

        int head = 0;
        int tail = arr.length - 1;
        int mid;

        while (head < tail) {
            mid = (head + tail) / 2;

            // 考虑特殊情形，例如[1, 1, 1, 0, 1]，此时用二分查找不能得到正确的结果；
            if (arr[head] == arr[mid]
                    && arr[head] == arr[tail]) {
                return geMin(arr);
            }

            if (arr[mid] <= arr[tail]) {
                tail = mid;
            } else {
                head = mid + 1;
            }
        }
        return arr[head];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 0, 1};
        System.out.println(min(arr));
    }

    public static int geMin(int[] arr) {
        int min = 0;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
