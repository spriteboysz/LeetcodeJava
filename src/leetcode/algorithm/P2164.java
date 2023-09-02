package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-07-08 23:58
 * LastEditTime: 2022-07-08 23:58
 * Description: 2164. 对奇偶下标分别排序
 */

public class P2164 {
    // code beginning
    class Solution {
        public int[] sortEvenOdd(int[] nums) {
            List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
            for (int i = 0; i < nums.length; ) {
                even.add(nums[i++]);
                if (i < nums.length) odd.add(nums[i++]);
            }
            even.sort(Integer::compareTo);
            odd.sort(Comparator.reverseOrder());

            int[] sortArray = new int[nums.length];
            int index = 0;
            for (int i = 0; i < nums.length; ) {
                sortArray[i++] = even.get(index);
                if (i < nums.length) sortArray[i++] = odd.get(index++);
            }
            return sortArray;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2164().new Solution();
        int[] ans = s.sortEvenOdd(new int[]{4, 1, 2});
        System.out.println(Arrays.toString(ans));
    }
}