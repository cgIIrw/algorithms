package jianzhi_offer;

public class NumberAppearOnce {

    public static int[] numberAppearOnce (int[] array) {
        int result = 0;
        for (int i : array) {
            result ^= i;
        }

        int result02 = 0;
        int result03 = 0;
        for (int i : array) {
            if ((result & i) != 0) {
                result02 ^= i;
            } else {
                result03 ^= i;
            }
        }
        return new int[]{result02, result03};
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 3, 7, 3, 2, 5, 5};
        System.out.println(numberAppearOnce(array)[0]);
        System.out.println(numberAppearOnce(array)[1]);

    }
}
