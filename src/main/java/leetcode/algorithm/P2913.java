package leetcode.algorithm;

import leetcode.common.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2024-01-01 11:26
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2913. 子数组不同元素数目的平方和 I
 */

public class P2913 {
    // code beginning
    class Solution {
        public int sumCounts(List<Integer> nums) {
            int sum = 0;
            for (int i = 0, n = nums.size(); i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Set<Integer> set = new HashSet<>();
                    for (int k = i; k <= j; k++) {
                        set.add(nums.get(k));
                    }
                    sum += (set.size() * set.size()) % 1000000007;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2913().new Solution();
        var ans = s.sumCounts(Utils.toList("[1,2,1]"));
        System.out.println(ans);
    }
}
