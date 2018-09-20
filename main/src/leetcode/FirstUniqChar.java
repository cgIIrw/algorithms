package leetcode;

/**
 * Created by yin on 18/5/3.
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回-1。
 * 您可以假定该字符串只包含小写字母
 */
public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        int[] index = new int[26];
        for (int i = 0; i < s.length(); i++) {
            index[s.charAt(i) - 'a']++;
        }

        // 这样写浪费了数组快速查询的优点
//        for (int e : index) {
//            if (e == 1) {
//                return
//            }
//        }
        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "asdwwsafdggh";
        System.out.println(firstUniqChar(s));
    }
}

/**
 * 这题关键是将数组索引和小写字母一一映射,一个简单的hash概念
 */
