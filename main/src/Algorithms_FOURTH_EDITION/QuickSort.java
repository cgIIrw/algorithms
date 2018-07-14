package Algorithms_FOURTH_EDITION;

import static Algorithms_FOURTH_EDITION.tools.SortTool.*;

public class QuickSort {
    public static <T extends Comparable> void sort(T[] arr, int left, int right) {
        if (left >= right)
            return;

        int i = left;
        int j = right;
        T k = arr[left];

        while (i < j) {
            while (!less(arr[j], k)) {
                j--;
                if (j == left)
                    break;
            }

            while (!less(k, arr[i]) && i < j) {
                i++;
            }

            if (i < j) {
                exch(arr, i, j);
            }
        }

        exch(arr, left, i);
        sort(arr, left, i - 1);
        sort(arr, i + 1, right);
    }


    public static void main(String[] args) {
        Integer[] ar = new Integer[]{1, 5, 7, 5, 6, 7, 3, 2};
        String[] strings = new String[]{"abcab", "ababc", "acbac"};
       sort(strings, 0, strings.length - 1);
        sort(ar, 0, ar.length - 1);

        System.out.println(isSorted(ar));
        show(ar);
        show(strings);
    }
}
