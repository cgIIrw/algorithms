// 跳台阶 简单跳台阶就是斐波拉契数列
public class JumpFloor {
  public static int jumpFloor(int target) {
    if (target == 0) {
      return 1;
    }
    if (target == 1) {
      return 1;
    }
    int a = jumpFloor(0);
    int b = jumpFloor(1);
    for (int i = 2; i < target; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    return a + b;
}

  public static void main(String[] args) {
    System.out.println(jumpFloor(4));
  }
}
