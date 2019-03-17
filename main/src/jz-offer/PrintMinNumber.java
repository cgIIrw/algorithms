// 把数组排成最小的数
// 题目限制为正整数数组，严格上来说应该检查输入数组
// 是不是正整数数组，但这里略了
import java.util.Arrays;
public class PrintMinNumber {
  public static String printMinNumber(int [] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new RuntimeException("错误的输入！");
    }

    // 将正整数转化为字符串
    String[] strs = new String[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      strs[i] = numbers[i] + "";
    }

    Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
    StringBuilder out = new StringBuilder();
    for (String s : strs) {
      out.append(s);
    }
    return out.toString();
  }

  public static void main(String[] args) {
    int[] input = new int[]{3, 32, 321};
    System.out.println(printMinNumber(input));
  }
}
