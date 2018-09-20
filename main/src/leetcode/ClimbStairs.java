package leetcode;

/**
 * Created by yin on 18/5/2.
 */
public class ClimbStairs {

    public static int climbStairs(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("输入了非法参数!");
        }
        if (n == 1 || n== 2) {
            return n;
        }

        int[] steps = new int[n];
        // step[0]表示n=1时;
        steps[0] = 1;
        // step[1]表示n=2时;
        steps[1] = 2;

        for (int i = 2; i <= n - 1; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }

        return steps[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(-1));
    }
}

/**
 * steps[]长度为n,每个数组索引i上的元素存储到达第i层台阶的方法数
 */
