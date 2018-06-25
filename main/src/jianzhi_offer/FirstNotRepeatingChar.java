package jianzhi_offer;

public class FirstNotRepeatingChar {

    public static char firstNotRepeatingChar(String string) {
        int[] array = new int[256];
        for (int i = 0; i < string.length(); i++) {
            array[string.charAt(i)]++;
        }

        for (int j = 0; j <= array.length; j++) {
            if (array[j] == 1) {
                return (char)j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingChar("abaccdeff"));
    }


}
