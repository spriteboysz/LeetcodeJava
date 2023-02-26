package leetcode.editor.cn.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-02-26 16:10
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2465. 不同的平均值数目
 */

public class P2465 {
    // code beginning
    class Solution {
        public int distinctAverages(int[] nums) {
            Set<Integer> set = new HashSet<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length / 2; i++) {
                set.add(nums[i] + nums[nums.length - 1 - i]);
            }
            return set.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2465().new Solution();
        Object ans = s.distinctAverages(new int[]{4, 1, 4, 0, 3, 5});
        System.out.println(ans);
    }
}
