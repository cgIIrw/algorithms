import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp)) {
                res[0] = map.get(comp);
                res[1] = i;
                return res;
            }
           map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution!");
    }
    public static void main(String args[]) {
        int[] arr = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
