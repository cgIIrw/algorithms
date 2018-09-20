package jianzhi_offer;

/**
 * 梅西 第一个只出现一次的字符
 */
public class FirstNotRepeatingChar {

    public static char firstNotRepeatingChar(String string) {

        if (string == null) {
            return 0;
        }

        int[] array = new int[256];
        for (int i = 0; i < string.length(); i++) {
            array[string.charAt(i)]++;
        }

        for (int j = 0; j <= array.length - 1; j++) {
            if (array[j] == 1) {
                return (char)j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingChar(null));
//        System.out.println('\u0000');
    }
}
