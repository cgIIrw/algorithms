// 丑数
import java.util.ArrayList;
public class GetUglyNumber_Solution {
  public static int getUglyNumber_Solution(int index) {
    if (index <= 0) {
      return 0;
    }

    ArrayList<Integer> arr = new ArrayList<>();
    // 三个缓存
    int temp2val = 1;
    int ref02 = 0;
    int temp3val = 1;
    int ref03 = 0;
    int temp5val = 1;
    int ref05 = 0;
    // 记录目前满足丑数条件的个数
    int count = 1;
    // 当前第count个丑数的值
    int val = 1;
    arr.add(val);
    while(count != index) {
      int minval = getMin(temp2val * 2, getMin(temp3val * 3, temp5val * 5));
      arr.add(minval);
      if (temp2val * 2 == minval) {
        ref02++;
        temp2val = arr.get(ref02);
      }

      // 如果都等于最小值，那么需要同步更新
      if (temp3val * 3 == minval) {
        ref03++;
        temp3val = arr.get(ref03);
      }

      if (temp5val * 5 == minval) {
        ref05++;
        temp5val = arr.get(ref05);
      }
      count++;
    }
    return arr.get(count - 1);
  }

  private static int getMin(int x, int y) {
    return x < y ? x : y;
  }

  public static void main(String[] args) {
    System.out.println(getUglyNumber_Solution(2));
  }
}
