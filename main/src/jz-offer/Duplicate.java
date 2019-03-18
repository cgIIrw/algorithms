// 数组中重复的数字
// 和某一题类似，但是不再是++，而是保存flag
// 牛课网的duplication[0]我也是醉了
public class Duplicate {
  public static boolean duplicate(int numbers[],int length,int [] duplication) {
    boolean[] flags = new boolean[length];
    for (int i = 0; i < length; i++) {
      if (flags[numbers[i]] == true) {
        duplication[0] = numbers[i];
        return true;
      } else {
        flags[numbers[i]] = true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] dupout = new int[1];
    int[] input = new int[]{2, 3, 1, 0, 2, 5, 3};
    int length  = input.length;

    boolean out = duplicate(input, length, dupout);
    System.out.println(out);
    System.out.println(dupout[0]);
  }
}
