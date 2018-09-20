package leetcode;

/**
 * Created by yin on 18/5/2.
 * 给定两个有序整数数组 nums1 和 nums2，将nums2合并到nums1中，使得num1成为一个有序数组。
 说明:
 1.初始化nums1和nums2的元素数量分别为m和n。
 2.你可以假设nums1有足够的空间（空间大小大于或等于m+n）来保存nums2中的元素。
 */
public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1;
        int n2 = n - 1;
        int h = n + m - 1;
        while (n1 != -1 && n2 != -1) {
            nums1[h--] = (nums1[n1] > nums2[n2]) ? nums1[n1--] : nums2[n2--];
        }
        while (n2 != -1) {
            nums1[h--] = nums2[n2--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        for (int i: nums1) {
            System.out.println(i);
        }
    }
}

/**
 * 因为都是已排序的数组,所以可以索引"下沉"依次比较,
 * 在n2遍历完后,n1还未遍历的元素,处在正确位置上。
 */
