package Algorithms_FOURTH_EDITION;

import static Algorithms_FOURTH_EDITION.tools.SortTool.*;

public class InsertionSort {
    public static <T extends Comparable> void sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (less(arr[j + 1], arr[j])) {
                    exch(arr, j + 1, j);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] ar = new Integer[]{1, 7, 6, 4, 3};
        String[] strings = new String[]{"abcab", "ababc", "acbac"};
        sort(strings);
        sort(ar);

        System.out.println(isSorted(ar));
        show(ar);
        show(strings);
    }
}
