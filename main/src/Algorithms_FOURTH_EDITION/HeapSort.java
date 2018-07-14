package Algorithms_FOURTH_EDITION;

import static Algorithms_FOURTH_EDITION.tools.SortTool.*;

public class HeapSort{

    public static <T extends Comparable> void sort(T[] arr) {
        int N = arr.length;
        for (int k = N / 2 - 1; k >= 0; k--) {
            sink(arr, k, N);
        }

        while (N > 0) {
            exch(arr, 0, N - 1);
            N--;
            sink(arr, 0, N);
        }
    }

    private static <T extends Comparable> void sink(T[] arr, int k, int N) {
        while (k <= N / 2 - 1) {
            int j = 2 * k + 1;
            // 找到左节点和右节点中较大的一个
            if (j + 1< N && less(arr[j], arr[j + 1])) {
                j++;
            }

            if (!less(arr[k], arr[j]))
                break;
            exch(arr, k, j);
            k = j;
        }
    }

    public static void main(String[] args) {
        Integer[] ar = new Integer[]{5, 1, 7, 6, 4, 7, 3};
        String[] strings = new String[]{"abcab", "ababc", "acbac"};
        sort(strings);
        sort(ar);

        System.out.println(isSorted(ar));
        show(ar);
        show(strings);
    }
}
