package Algorithms_FOURTH_EDITION;

import static Algorithms_FOURTH_EDITION.tools.SortTool.*;

import java.util.ArrayList;
import java.util.List;


public class MergeSort {


    public static <T extends Comparable> void sort(T[] arr) {
        List<T> aux = new ArrayList<>(arr.length);

        sort(arr, 0, arr.length - 1, aux);
    }

    private static <T extends Comparable> void sort(T[] arr, int left, int right, List<T> aux) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        sort(arr, left, mid, aux);
        sort(arr, mid + 1, right, aux);
        merge(arr, left, mid, right, aux);
    }

    public static <T extends Comparable> void merge(T[] arr, int left, int mid, int right, List<T> aux) {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while (i <= mid && j <= right) {
            if (!less(arr[j], arr[i])) {
                aux.add(t++, arr[i++]);
            } else {
                aux.add(t++, arr[j++]);
            }
        }

        while (i <= mid) {
            aux.add(t++, arr[i++]);
        }

        while (j <= right) {
            aux.add(t++, arr[j++]);
        }

        t = 0;

        while (left <= right) {
            arr[left++] = aux.get(t++);
        }
    }

    public static void main(String[] args) {

        Integer[] ar = new Integer[]{1, 7, 7, 6, 4, 3};
        String[] strings = new String[]{"abcab", "ababc", "acbac"};
        sort(strings);
        sort(ar);

        System.out.println(isSorted(ar));
        show(ar);
        show(strings);
    }
}
