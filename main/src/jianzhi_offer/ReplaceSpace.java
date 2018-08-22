package jianzhi_offer;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 替换空格
 * 题目描述：
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串
 * 为We%20Are%20Happy。
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }

        int len = str.length();

        // Arrays.asList()不能将char数组按每个字符为元素转化为数列
        // https://stackoverflow.com/questions/15590675/converting-char-array-to-list-in-java
        List<Character> list = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.toList());

        list.stream().filter(x -> x.equals(' '))
                .forEach(x -> str.append("  "));

        int i = len - 1;
        int j = str.length() - 1;

        while (i >= 0 && j > i) {
            char c = str.charAt(i--);
            if (c == ' ') {
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
            } else {
                str.setCharAt(j--, c);
            }
        }

        return str.toString();

    }

    public static void main(String[] args) {
        String s = "We are happy";

        System.out.println(replaceSpace(new StringBuffer(s)));

    }
}
