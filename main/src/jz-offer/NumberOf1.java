// 二进制中1的个数
public class NumberOf1 {
  public static int numberOf1(int n) {
    int count = 0;
    while(n != 0) {
      n = (n - 1) & n;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(numberOf1(6));
  }
}
