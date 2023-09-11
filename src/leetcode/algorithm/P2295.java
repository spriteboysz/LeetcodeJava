package leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2023-09-09 21:35
 * FileName: src/leetcode/algorithm
 * Description:2295. 替换数组中的元素
 */

public class P2295 {
    // code beginning
    class Solution {
        public int[] arrayChange(int[] nums, int[][] operations) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int i = 0, n = nums.length; i < n; i++) {
                hash.put(nums[i], i);
            }
            for (int[] operation : operations) {
                int a = operation[0], b = operation[1];
                hash.put(b, hash.get(a));
                hash.remove(a);
            }
            for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                nums[entry.getValue()] = entry.getKey();
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2295().new Solution();
        var ans = s.arrayChange(new int[]{1, 2, 4, 6}, new int[][]{{1, 3}, {4, 7}, {6, 1}});
        System.out.println(Arrays.toString(ans));
    }
}
