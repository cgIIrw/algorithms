// 斐波那契数列
// 这题采用动态规划的方法，可以减少时间
// 复杂度和空间复杂度
public class Fibonacci {
  public static int fibonacci(int n) {
    if (n < 0) {
      throw new RuntimeException("输入参数错误！");
    }
    // 斐波那契数列不是跳台阶，n==0时，返回0
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    int a = fibonacci(0);
    int b = fibonacci(1);

    for (int i = 2; i < n; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(5));
  }
}
