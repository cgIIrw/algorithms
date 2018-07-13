package Algorithms_FOURTH_EDITION;

import static Algorithms_FOURTH_EDITION.tools.SortTool.*;

public class BubbleSort{

    public static  <T extends Comparable> void sort(T[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (less(arr[j + 1], arr[j])) {
                    exch(arr, j + 1, j);
                    flag = true;
                }
            }
            if (!flag) {
                break;
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
