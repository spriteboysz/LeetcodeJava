package leetcode.algorithm;

import leetcode.common.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Deean
 * Date: 2023-12-31 20:32
 * FileName: src/main/java/leetcode/algorithm
 * Description: 2869. 收集元素的最少操作次数
 */

public class P2869 {
    // code beginning
    class Solution {
        public int minOperations(List<Integer> nums, int k) {
            int operations = 0;
            Set<Integer> set = new HashSet<>();
            for (int i = nums.size() - 1; i >= 0 && set.size() < k; i--) {
                int num = nums.get(i);
                if (num <= k) {
                    set.add(num);
                }
                operations++;
            }
            return operations;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2869().new Solution();
        var ans = s.minOperations(Utils.toList("[3,1,5,4,2]"), 5);
        System.out.println(ans);
    }
}
