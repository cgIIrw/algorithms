// 快速幂
// 这个视频讲授得非常清楚https://v.qq.com/x/page/l0323gb50p2.html
// 考虑鲁棒性，考虑指数为负数，考虑double不能隐式转换

public class Power {

  public static double power(double base, int exponent) {
    if(base == 0 && exponent <= 0) {
      throw new RuntimeException("没有意义的输入！");
    }
    if (exponent == 0) {
      return 1;
    }

    int flag = exponent;

    // 注意考虑指数为负数情况
    if (exponent < 0) {
      exponent = - exponent;
    }

    double temp = base;
    int out = 1;
    while(exponent != 0) {
      if ((exponent & 1) != 0) {
        out *= temp;
      }
      temp *= temp;
      exponent >>= 1;
    }
    // 注意不能是1，应该是1.0
    return flag > 0 ? out : (1.0 / out);
  }

  public static void main(String[] args) {
    System.out.println(power(3.0, -2));
  }
}
