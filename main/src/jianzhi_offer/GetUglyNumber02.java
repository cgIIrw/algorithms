package jianzhi_offer;

/**
 * 马奎斯 丑数
 */
public class GetUglyNumber02 {

    public static int getUglyNumber02(int index) {
        if (index <= 0) {
            throw new IllegalArgumentException("参数错误！");
        }

        int[] arrNums = new int[index];
        // 数组第一个丑数为1
        arrNums[0] = 1;
        int num = 1;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        while (num < index) {
            arrNums[num] = min(arrNums[n1] * 2, arrNums[n2] * 3, arrNums[n3] * 5);
            while (arrNums[n1] * 2 <= arrNums[num]) {
                n1++;
            }
            while (arrNums[n2] * 3 <= arrNums[num]) {
                n2++;
            }
            while (arrNums[n3] * 5 <= arrNums[num]) {
                n3++;
            }
            num++;
        }
        return arrNums[index - 1];
    }

    public static void main(String[] args) {
        System.out.println(getUglyNumber02(0));
    }

    public static int min(int a, int b, int c) {
        int temp = a < b ? a : b;
        return temp < c ? temp : c;
    }
}
