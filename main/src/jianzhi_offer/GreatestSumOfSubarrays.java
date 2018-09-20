package jianzhi_offer;

/**
 * 梅西 连续子数组的最大和
 */
public class GreatestSumOfSubarrays {

    public static int findGreatestSumOfSubarrays(int[] data) {
        // 判空指针以及处理数组为空的情况
        if (data == null || data.length <= 0) {
            return 0;
        }

        // 初始点，从这个点开始迭代
        int initSum = data[0];
        int maxSum = initSum;

        for (int i = 1; i < data.length; i++) {
            if (initSum > 0) {
                initSum += data[i];
            } else {
                initSum = data[i];
            }

            if (initSum > maxSum) {
                maxSum = initSum;
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[] data = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(findGreatestSumOfSubarrays(data));
    }
}
