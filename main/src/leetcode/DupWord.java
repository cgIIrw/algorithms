package leetcode;

/**
 * 输入的数组大小为n，数组元素的范围在0 ～ n-1，打印出某个重复出现的元素
 */
public class DupWord {
    public static Integer dup(int[] arr) {
        int[] array = arr;
        int[] h = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            h[array[i]]++;
        }

        for (int j = 0; j < h.length; j++) {
            if (h[j] > 1) {
                return j;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 4, 5, 0};
        System.out.println(dup(arr));
    }
}