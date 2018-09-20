package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yin on 18/5/2.
 */
public class Shuffle<E> {
    public List<E> shuffle(E[] nums) {
        List<E> list = Arrays.asList(nums);
        Collections.shuffle(list);
        return list;
    }

    public static void main(String[] args) {
        Shuffle<Integer> test = new Shuffle<>();
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        for (Integer e: test.shuffle(nums)) {
            System.out.print(e + " ");
        }
    }
}
