// 数组中出现次数超过一半的数字
// 核心思想->消消乐，超过一半的
// 数字最后一定可以把其它的数字消完
public class MoreThanHalfNum_Solution {
  public static int moreThanHalfNum_Solution(int [] array) {
    int out = array[0];
    int count = 1;
    for (int i = 1; i < array.length; i++) {
      if (out == array[i]) {
        count++;
      } else if (count != 0) {
        count--;
      } else {
        out = array[i];
        count = 1;
      }
    }

    int testCount = 0;
    for (int j = 0; j < array.length; j++) {
      if (out == array[j]) {
        testCount++;
      }
    }
    if (testCount > array.length / 2) {
      return out;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int[] input = new int[]{1, 1, 1, 1, 1, 6, 5, 4};
    System.out.println(moreThanHalfNum_Solution(input));
  }
}
