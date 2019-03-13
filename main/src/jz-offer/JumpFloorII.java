// 变态跳台阶 关键是找到规律，可用中学归纳法
// f(n)=2 * f(n-1)
public class JumpFloorII {
  public static int jumpFloorII(int target) {
    if (target == 0) {
      return 1;
    }

    if (target == 1) {
      return 1;
    }

    int temp = jumpFloorII(1);
    // Java没有尾递归优化，还是使用循环吧
    for (int i = 2; i <= target; i++) {
      temp = 2 * temp;
    }
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(jumpFloorII(6));
  }
}
