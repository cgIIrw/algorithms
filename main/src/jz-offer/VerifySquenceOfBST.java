// 二叉搜索树的后续遍历序列
// 关于边界有一点需要注意，二叉搜索树是可以为空树的
public class VerifySquenceOfBST {
  public static boolean verifySquenceOfBST(int [] sequence) {
    if (sequence == null) {
      return false;
    }
    if (sequence.length == 1 || sequence.length == 0) {
      return true;
    }

    int[] subLeftSequence = new int[0];
    int[] subRightSequence = new int[0];
    int rootVal = sequence[sequence.length - 1];
    boolean flag = false;
    int temp = 0;
    for (int i = 0; i < sequence.length - 1; i++) {
      if (sequence[i] > rootVal && !flag) {
        flag = true;
        temp = i;
        subLeftSequence = new int[i];
        System.arraycopy(sequence, 0, subLeftSequence, 0, i);
      }
      if (flag && sequence[i] < rootVal) {
        return false;
      }
      if (i == sequence.length - 2) {
        subRightSequence = new int[sequence.length - 1 - i];
        System.arraycopy(sequence, i, subRightSequence, 0, sequence.length - 1 - i);
      }
    }
    return verifySquenceOfBST(subLeftSequence) && verifySquenceOfBST(subRightSequence);
  }

  public static void main(String[] args) {
    int[] arr = new int[]{3, 9, 5, 7};
    int[] arr1 = new int[]{3, 6, 5, 9, 7};
    int[] arr0 = new int[0];
    System.out.println(verifySquenceOfBST(arr));
    System.out.println(verifySquenceOfBST(arr1));
    System.out.println(verifySquenceOfBST(arr0));
  }
}
