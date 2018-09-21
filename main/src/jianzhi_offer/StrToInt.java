package jianzhi_offer;

/**
 * 哈维 把字符串转换成整数
 */
public class StrToInt {

    public static int strToInt(String s) {
        if (s == null || s.length() <= 0) {
            return -1;
        }

        // 首先判断是不是负数，负数会强行书写'－'，而正号不必；
        boolean isNega = s.charAt(0) == '-';
        int num = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                continue;
            }

            char charNum = s.charAt(i);

            if (s.charAt(i) - '0' < 0 || s.charAt(i) - '9' > 0) {
                return -1;
            }

            num = num * 10 + (int) (charNum - '0');
        }
        return isNega ? -num : num;
    }

    public static void main(String[] args) {
        String s = "+a212";
        System.out.println(strToInt(s));
    }
}

