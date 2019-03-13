// 旋转数组的最小数字
// 非递减
public class MinNumberInRotateArray {
  public static int minNumberInRotateArray(int [] array) {
    if (array == null) {
      throw new RuntimeException("输入的数组为null！！");
    }

    if (array.length == 0) {
      return 0;
    }

    int i = 0, j = array.length - 1, m;

    while(i < j) {
      m = (i + j) / 2;
      // 这里最好使用小于等于，不然当数组出现
      // 无限相同的数时，相对较慢一点
      if (array[m] <= array[j]) {
        j = m;
      } else {
        // 需要加1
        i = m + 1;
      }
    }
    return array[i];
  }

  public static void main(String[] args) {
    int[] arr = new int[] {3, 4, 5, 2, 2};
    System.out.println(minNumberInRotateArray(arr));
  }
}
