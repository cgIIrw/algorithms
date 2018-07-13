package Algorithms_FOURTH_EDITION;

import static Algorithms_FOURTH_EDITION.tools.SortTool.*;

public class ShellSort {

    public static <T extends Comparable> void sort(T[] arr) {
        int h = arr.length;

        while (h >= 1){
            h = h / 3;
            for (int i = h; i < arr.length; i++) {
                for (int j = i - h; j >= 0; j -= h) {
                    if (less(arr[j + h], arr[j])) {
                        exch(arr, j + h, j);
                    } else {
                        break;
                    }
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
