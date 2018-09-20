package jianzhi_offer;

import java.util.InputMismatchException;

/**
 * 小罗 数组中只出现一次的数字
 */
public class NumberAppearOnce {

    public static int[] numberAppearOnce (int[] array) {
        int result = 0;
        int count;
        int result02 = 0;
        int result03 = 0;

        if (array == null || array.length <= 0) {
            throw new InputMismatchException();
        }
        for (int i : array) {
            result ^= i;
        }



        count = findNotOne(result);

        for (int i : array) {
            if (isOne(result ^ i, count)) {
                result02 ^= i;
            } else {
                result03 ^= i;
            }
        }
        return new int[]{result02, result03};
    }

    // 计算从右到左不为0的位
    public static int findNotOne(int num) {
        if (num == 0) {
            return 0;
        }
        int count = 0;
        while (true) {
            count++;
            if (num % 2 == 1) {
                break;
            }
            num = num >> 1;
        }
        return count;
    }

    // 判断num的count位上是不是1
    public static boolean isOne(int num, int count) {
        num = num >> (count - 1);
        return num % 2 == 1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 3, 7, 3, 2, 5, 5};
        int[] array02 = new int[]{2, 5, 3, 7, 3, 7, 4, 4};
        int[] array03 =null;
        System.out.println(numberAppearOnce(array02)[0]);
        System.out.println(numberAppearOnce(array02)[1]);
    }
}
