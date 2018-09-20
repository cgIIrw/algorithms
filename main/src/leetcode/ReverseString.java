package leetcode;

/**
 * Created by yin on 18/5/2.
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 */
public class ReverseString {
    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        int n = s.length() - 1;
        for (int j = (n - 1) >> 1; j >= 0; j--) {
            int k = n - j;
            char cj = sb.charAt(j);
            char ck = sb.charAt(k);
            sb.setCharAt(j,ck);
            sb.setCharAt(k,cj);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("你好"));
    }
}

/**
 * AbstractStringBuilder实现会增加isSurrogate判断
 */


