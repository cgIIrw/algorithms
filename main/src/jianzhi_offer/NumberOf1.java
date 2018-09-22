package jianzhi_offer;

/**
 * 巴尔德斯 二进制中1的个数
 */
public class NumberOf1 {

    public static int numberOf1(int i) {
        int count = 0;

        while (i != 0) {
            count++;

            i = (i - 1) & i;

        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(numberOf1(7));
    }
}
