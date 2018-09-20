package jianzhi_offer;

/**
 * 小罗 数字在排序数组中出现的次数
 */
public class GetNumberOfK {

    public static int findFirstK(int[] arr, int k, int i, int j) {
        if (i > j) {
            return -1;
        }
        int mid = (i + j) / 2;

        // 第一种情况，arr[mid]是k，如果，索引mid - 1上的值不是k，
        // 说明，arr[mid]正好就是要求的k
        if((mid > i && arr[mid] == k && arr[mid - 1] != k) || mid  == i) {
            return mid;
        }

        // 第二种情况，当arr[mid] < k，说明在后半段
        else if (arr[mid] < k) {
            i = mid + 1;
        }

        // 第三种情况，说明在左半段
        else {
            j = mid - 1;
        }

        return findFirstK(arr, k, i, j);

    }

    // 原理同findFirstK()
    public static int findLastK(int[] arr, int k, int i, int j) {
        if (i > j) {
            return -1;
        }
        int mid = (i + j) / 2;

        if((mid < j && arr[mid] == k && arr[mid + 1] != k) || mid  == j) {
            return mid;
        } else if (arr[mid] > k) {
            j = mid - 1;
        } else {
            i = mid + 1;
        }

        return findLastK(arr, k, i, j);
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 3, 3, 3, 4, 5};
//        System.out.println(findFirstK(num, 3, 0, num.length - 1));
//        System.out.println(findLastK(num, 3, 0, num.length - 1));
        int number = - findFirstK(num, 3, 0, num.length - 1)
                + findLastK(num, 3, 0, num.length - 1) + 1;
        System.out.println(number);
    }
}
