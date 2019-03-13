// 二维数组中的查找
public class Find {
  public static boolean find(int[][] arr, int target) {
    if (arr == null) {
      return false;
    }
    int i = arr.length - 1;
    int j = 0;
    while(i >= 0 && j < arr[0].length) {
      if (arr[i][j] == target) {
        return true;
      }
      if (arr[i][j] > target) {
        i--;
        continue; // 不要忘记continue，或者记得使用if else
      }
      if (arr[i][j] < target) {
        j++;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int[][] arr = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}};
    System.out.println(Find.find(arr, 20));
  }
}
