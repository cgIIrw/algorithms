package jianzhi_offer;

/**
 * 卡卡 数组中重复的数字
 */
public class Duplicate {

    public static boolean duplicate(int[] arr) {
        if (arr == null) {
            return false;
        }

        for (int e : arr) {
            if (e < 0 || e > arr.length - 1) {
                return false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            // 这一步if显得多余，但是是第一次编写的时候添加的，
            // 这里不做更改交给以后review吧
            if (i == arr[i]) {
                continue;
            } else {
                while (i != arr[i]) {
                    if (arr[i] == arr[arr[i]]) {
                        return true;
                    }
                    int temp = arr[i];
                    arr[i] = arr[arr[i]];
                    arr[temp] = temp;
                }
            }
        }
       return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {17};
        System.out.println(duplicate(arr));
    }
}
