package Algorithms_FOURTH_EDITION;

import static Algorithms_FOURTH_EDITION.tools.SortTool.*;

public class SelectionSort{

    public static <T extends Comparable> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            T temp = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (less(arr[j], arr[i])) {
                    exch(arr, j, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] ar = new Integer[]{5, 2, 6, 4, 3};
        sort(ar);
        show(ar);
    }
}
