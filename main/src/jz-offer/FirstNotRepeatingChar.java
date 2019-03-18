// 第一个只出现一次的字符
public class FirstNotRepeatingChar {
  public static int firstNotRepeatingChar(String str) {
    if (str == null) {
      throw new RuntimeException("传入的字符串不能为空！");
    }

    int[] charArr = new int[256];
    for (int i = 0; i < str.length(); i++) {
      charArr[str.charAt(i)]++;
    }

    for(int j = 0; j < str.length(); j++) {
      if (charArr[str.charAt(j)] == 1) {
        return j;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String s = "aba";
    System.out.println(firstNotRepeatingChar(null));
  }
}
