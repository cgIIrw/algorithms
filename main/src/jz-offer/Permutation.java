// 字符串的排列
/**
 * 用字典序法来解这道题，主要思想是，
 * 按从小到大找到当前排列的下一个排列
 * 从尾部往前找到第一个变小的数字，记录下该位置，
 * 然后从该位置往后找到最后一个大于它的数，然后交换.....
 */
import java.util.*;

public class Permutation {
    public static ArrayList<String> permutation(String str) {
        ArrayList<String> out = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return out;
        }
        char[] input = str.toCharArray();
        Arrays.sort(input);
        func(input, out);
        return out;
    }

    private static void func(char[] input, ArrayList<String> out) {
        int len = input.length;
        boolean flag = true;
        while (flag) {
            out.add(new String(input));
            int cur01 = len;
            int cur02 = 0;
            // 从后到前找到第一个变小的元素
            for (int i = len - 1; i >= 1; i--) {
                if (input[i - 1] < input[i]) {
                    // 找到的变小元素的下一个元素
                    cur01 = i;
                    break;
                }
            }
            if (cur01 == len) {
                flag = false;
                continue;
            }

            for (int j = cur01; j < len; j++) {
                // 大于等于适用于重复的字符
                if (input[cur01 - 1] >= input[j]) {
                    cur02 = j - 1;
                    break;
                }
                // 这个判断是用来处理极端情况时候的情形
                if (j == len - 1) {
                    cur02 = len - 1;
                }
            }

            swap(input, cur01 - 1, cur02);
            // 从cur01开始到结尾重新从小到大排序
            Arrays.sort(input, cur01, len);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s01 = "aaaaab";
        String s02 = "abc";
        System.out.println(permutation(s01));
        System.out.println(permutation(s02));
    }
}
