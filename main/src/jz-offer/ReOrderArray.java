// 调整数组顺序使奇数位于偶数前面

public class ReOrderArray {
  public static void reOrderArray(int [] array) {
    if (array == null || array.length == 0) {
      return;
    }

    int len = array.length;
    int[] carr = new int[len];
    System.arraycopy(array, 0, carr, 0, len);
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 1) {
        count++;
      }
    }

    int m = 0;
    int n = count;
    for (int i = 0; i < len; i++) {
      if (array[i] % 2 == 1) {
        carr[m] = array[i];
        m++;
      } else {
        carr[n] = array[i];
        n++;
      }
    }
    for (int i = 0; i < len; i++) {
      array[i] = carr[i];
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{5, 7, 2, 9, 8};
    reOrderArray(arr);
    System.out.println(arr[3]);
  }
}
