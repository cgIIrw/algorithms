// 顺时针打印矩阵
// 此题注意引用的返回
/** 旋转：
 *      1, 2, 3      3, 6
 *      4, 5, 6  ->  2, 5
 *                   1, 4
 */
import java.util.ArrayList;
public class PrintMatrix {
  public static ArrayList<Integer> printMatrix(int [][] matrix) {
    if (matrix == null || matrix[0].length == 0) {
      return null;
    }
    ArrayList<Integer> out = new ArrayList<>();
    while(matrix.length != 0) {
      for (int i = 0; i < matrix[0].length; i++) {
        out.add(matrix[0][i]);
      }
      if (matrix.length == 1) {
        break;
      }
      matrix = rotateMethod(matrix);
      int[][] temp = new int[matrix.length][matrix[0].length - 1];
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length - 1; j++) {
          temp[i][j] = matrix[i][j + 1];
        }
      }
      // 不要忘记替换
      matrix = temp;
    }
    return out;
  }

  private static int[][] rotateMethod(int[][] arr) {
    if (arr == null || arr[0] == null) {
      return null;
    }
    // 行
    int row = arr.length;
    // 列
    int col = arr[0].length;
    int[][] newArr = new int[col][row];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        newArr[col - j - 1][i] = arr[i][j];
      }
    }
    return newArr;
  }

  public static void main(String[] args) {
    int[][] in = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    System.out.println(printMatrix(in));
  }
}
