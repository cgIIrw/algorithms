// 连续子数组的最大和
// 测试用例：6, －3, －2, 7, －15, 1, 2, 2
public class FindGreatestSumOfSubArray {
  public static int findGreatestSumOfSubArray(int[] array) {
    // 题目要求子向量的长度至少是1
    if (array == null || array.length < 1) {
      throw new RuntimeException("传入参数错误！");
    }

    // max是遍历到的当前位置累加的最大值
    // 由于所有的元素可能都是负数，初始值不要设为0
    int acc = array[0];
    // 历史最大
    int out = acc;
    for (int i = 1; i < array.length; i++) {
      acc = acc > 0 ? acc + array[i] : array[i];
      out = out > acc ? out : acc;
    }
    return out;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{6, -3, -2, 7, -15, 1, 2, 2};
    System.out.println(findGreatestSumOfSubArray(arr));
  }
}
