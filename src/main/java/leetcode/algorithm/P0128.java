package leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2022-08-26 23:14
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 128. 最长连续序列
 */

public class P0128 {
    // code beginning
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) set.add(num);

            int max = 0;
            for (int num : set) {
                if (set.contains(num - 1)) continue;
                int cur = num, curCon = 1;
                while (set.contains(cur + 1)) {
                    cur += 1;
                    curCon++;
                }
                max = Math.max(max, curCon);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0128().new Solution();
        Object ans = s.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        System.out.println(ans);
    }
}