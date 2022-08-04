package leetcode.editor.cn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Deean
 * Date: 2022-08-04 23:10
 * Description: 1403. 非递增顺序的最小子序列
 */

public class P1403 {
    // code beginning
    class Solution {
        public List<Integer> minSubsequence(int[] nums) {
            Arrays.sort(nums);
            int sum = 0, cur = 0;
            for (int num : nums) sum += num;

            List<Integer> subsequence = new ArrayList<>();
            for (int i = nums.length - 1; i >= 0; i--) {
                cur += nums[i];
                subsequence.add(nums[i]);
                if (sum - cur < cur) break;
            }
            return subsequence;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1403().new Solution();
        Object ans = s.minSubsequence(new int[]{4, 4, 7, 6, 7});
        System.out.println(ans);
    }
}
