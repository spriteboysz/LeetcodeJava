package leetcode.editor.cn.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Deean
 * Date: 2022-08-12 23:16
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2099. 找到和最大的长度为 K 的子序列
 */

public class P2099 {
    // code beginning
    class Solution {
        public int[] maxSubsequence(int[] nums, int k) {
            int[] clone = nums.clone();
            Arrays.sort(clone);

            Map<Integer, Integer> map = new HashMap<>();
            for (int j = nums.length - 1; j >= nums.length - k; j--) {
                map.put(clone[j], map.getOrDefault(clone[j], 0) + 1);
            }
            int[] subSequence = new int[k];
            for (int i = 0, j = 0; i < nums.length && j < k; i++) {
                if (map.getOrDefault(nums[i], 0) > 0) {
                    subSequence[j++] = nums[i];
                    map.put(nums[i], map.get(nums[i]) - 1);
                }
            }
            return subSequence;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2099().new Solution();
        int[] ans = s.maxSubsequence(new int[]{-1, -2, 3, 4}, 3);
        System.out.println(Arrays.toString(ans));
    }
}