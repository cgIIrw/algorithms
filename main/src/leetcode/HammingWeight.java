package leetcode;

/**
 * Created by yin on 18/5/2.
 * 编写一个函数，输入是一个无符号整数，
 * 返回其二进制表达式中数字位数为‘1’的个数（也被称为汉明重量）。
 */
public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-11345));
        System.out.println(hammingWeight(-11345));
    }
}

/**
 * 不采用右移是因为负数右移后高位补1
 */
