package leetcode.algorithm;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-08-29 14:07
 * FileName: src/leetcode.algorithm
 * Description:2824. 统计和小于目标的下标对数目
 */

public class P2824 {
    // code beginning
    class Solution {
        public int countPairs(List<Integer> nums, int target) {
            int cnt = 0;
            for (int i = 0, n = nums.size(); i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums.get(i) + nums.get(j) < target) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2824().new Solution();
        List<Integer> nums = List.of(-1, 1, 2, 3, 1);
        Object ans = s.countPairs(nums, 2);
        System.out.println(ans);
    }
}
