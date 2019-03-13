// 矩形覆盖 继续是斐波拉契数列
public class RectCover {
  public static int rectCover(int target) {
    if (target < 0) {
      throw new RuntimeException("参数出错！");
    }

    if (target == 0) {
      return 1;
    }

    if (target == 1) {
      return 1;
    }

    int a = 1;
    int b = 1;

    for (int i = 2; i<= target; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    return b;
  }

  public static void main(String[] args) {
    System.out.println(rectCover(5));

  }
}
