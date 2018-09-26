package jianzhi_offer;

import java.util.Random;

/**
 * 斯内德 最小的k个数
 */
public class GetLeastNumbers {

    public static int[] getLeastNumbers(int[] input, int k) {

        if (k > input.length) {
            return new int[0];
        }

        int[] output = new int[k];
        int start = 0;
        int end = input.length - 1;

        int index = patition(input, start, end);

        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = patition(input, start, end);
            } else {
                start = index + 1;
                index = patition(input, start, end);
            }
        }

        for (int i = 0; i < k; i++) {
            output[i] = input[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 3, 1, 7};
        int[] output = getLeastNumbers(arr, 7);
        for (int i : output) {
            System.out.println(i);
        }
    }

    public static int patition(int data[], int start, int end) {
        int index = randInt(start, end);
        exch(data, index, end);

        int q = start - 1;

        for (int j = start; j < end; j++) {
            if (data[j] < data[end]) {
                if (q != j) {
                    q++;
                    exch(data, q, j);
                }
            }
        }
        q++;
        exch(data, q, end);
        return q;
    }

    private static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    private static void exch(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
