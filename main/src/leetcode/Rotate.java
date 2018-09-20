package leetcode;

/**
 * Created by yin on 18/5/3.
 * 给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
 */
public class Rotate {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int j = len - 1;
        int i = len - k - 1;
        reverse(nums, 0, i);
        reverse(nums, i + 1, j);
        reverse(nums, 0, j);
    }

    private static void reverse(int[] nums1, int i, int j) {
        int m = i;
        int n = j;
        int temp = 0;
        while (m < n) {
            temp = nums1[m];
            nums1[m] = nums1[n];
            nums1[n] = temp;
            m++;
            n--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        rotate(nums, 2);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}

/**
 * 三个reverse()
 */
