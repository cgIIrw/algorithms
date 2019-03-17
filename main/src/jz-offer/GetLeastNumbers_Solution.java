// 最小的k个数
// 测试用例：4,5,1,6,2,7,3,8
// 构造一个大根堆，大根堆里其它元素都比根元素小
// 大根堆还有个性质就是通过它求出的最小的k个数字
// 并非已排序，所以求的结果不是原题要求的子集
import java.util.ArrayList;
import java.util.Arrays;
public class GetLeastNumbers_Solution {
  public static ArrayList<Integer> getLeastNumbers_Solution(int [] input, int k) {
    if (input == null || k == 0 || input.length < k) {
      return new ArrayList<>();
    }

    int[] target = new int[k];
    int i = 0;
    for (; i < input.length; i++) {
      if (i < k) {
        target[i] = input[i];
        continue;
      }
      if (i == k) {
        for (int j = k / 2 - 1; j >= 0; j--) {
          sink(target, j);
        }
      }

      if (input[i] < target[0]) {
        target[0] = input[i];
        for (int j = k / 2 - 1; j >= 0; j--) {
          sink(target, j);
        }
      }
    }

    ArrayList<Integer> out = new ArrayList<>();
    for (int e: target) {
      out.add(e);
    }
    return out;
  }

  // 下沉方法，作用是从下到上，不停比较并调换，以期将数组
  // 满足堆的性质，即节点都小于父节点
  private static void sink(int[] arr, int q) {
    int len = arr.length;
    while(q <= len / 2 - 1) {
      int j = 2 * q + 1;
      if (j + 1 < len && arr[j] < arr[j + 1]) {
        j++;
      }

      if (arr[q] >= arr[j]) {
        break;
      }

      exch(arr, q, j);
      q = j;
    }
  }

  // 交换数组的i和j元素
  private static void exch(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void main(String[] args) {
    int[] input = new int[]{4, 5, 1, 6, 2, 7, 3, 8};
    System.out.println(getLeastNumbers_Solution(input, 5));
  }

}
