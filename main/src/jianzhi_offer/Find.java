package jianzhi_offer;

import java.util.Arrays;

/**
 * 二维数组中的查找
 * 题目描述：
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
 * 个整数，判断数组中是否含有该整数。
 */
public class Find {
    public static boolean find(int target, int[][] array) {
        boolean[] flag = new boolean[1];
        flag[0] = false;
        if (array == null) {
            return false;
        }

        Arrays.stream(array)
                .flatMapToInt(x -> Arrays.stream(x))
                .filter(x -> x == target)
                .forEach(x -> flag[0] = true);
        return flag[0];
    }

    public static void main(String[] args) {

        int[][] testArray=new int[4][4];
        testArray[0][0] = 1;
        testArray[0][1] = 2;
        testArray[0][2] = 8;
        testArray[0][3] = 9;
        testArray[1][0] = 2;
        testArray[1][1] = 4;
        testArray[1][2] = 9;
        testArray[1][3] = 12;
        testArray[2][0] = 4;
        testArray[2][1] = 7;
        testArray[2][2] = 10;
        testArray[2][3] = 13;
        testArray[3][0] = 6;
        testArray[3][1] = 8;
        testArray[3][2] = 11;
        testArray[3][3] = 15;
        System.out.println(find(5, testArray));
    }
}
