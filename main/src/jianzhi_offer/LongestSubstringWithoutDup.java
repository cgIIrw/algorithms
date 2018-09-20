package jianzhi_offer;

/**
 * 埃托奥 最长不含重复字符的子字符串
 */
public class LongestSubstringWithoutDup {

    public static int longestSubstringWithoutDup(String s) {

        if (s == null || s.length() <= 0) {
            return 0;
        }

        // 当前循环到的char数组某个元素时的长度
        int currlen = 0;
        // 历史最长长度
        int maxlen = 0;
        int[] temp = new int[256];

        for (int i = 0; i < s.length() - 1; i++) {

            if (temp[s.charAt(i)] == 0) {

                // 一旦字符串的字符在temp中没有对应的赋值，
                // 则将当前的i赋值给它，表示第i个元素是该字符串的这个字符
                // 但是由于temp数组内的元素默认都是0，所以这里进行加1处理，
                // 每次参与与运算的时候考虑这个加1的操作；
                temp[s.charAt(i)] = i + 1;
                currlen++;

            } else {
                // 由于之前temp都是赋值为i + 1，所以这里也要把1考虑进去；
                currlen = i - temp[s.charAt(i)] + 1;
            }

            maxlen = maxlen > currlen ? maxlen : currlen;
            // 更新temp保存的索引；
            temp[s.charAt(i)] = i + 1;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "acabvbswwq";
        System.out.println(longestSubstringWithoutDup(s));
    }
}
