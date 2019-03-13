// 替换空格
public class ReplaceSpace {
  public static void replaceSpace(StringBuilder str) {
    int i = 0;
    int len = str.length();
    while(i < len) {
      if (str.charAt(i) == ' ') {
        str.append("  "); // 这里是两个空
      }
      i++;
    }
    int n = len - 1;
    int m = str.length() - 1;
    while(n >= 0 && n < m) {
      if(str.charAt(n) == ' ') {
        n--;
        str.setCharAt(m, '0');
        m--;
        str.setCharAt(m, '2');
        m--;
        str.setCharAt(m, '%');
        m--;
        continue;
      }
      if (str.charAt(n) != ' ') {
        char c = str.charAt(n);
        n--;
        str.setCharAt(m, c);
        m--;
      }
    }
  }

  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("asd dfg ww");
    replaceSpace(s);
    System.out.println(s.toString());
  }
}
