package leetcode.algorithm;

import java.util.HashSet;

/**
 * Author: Deean
 * Date: 2023-09-08 22:42
 * FileName: src/leetcode/algorithm
 * Description:2442. 反转之后不同整数的数目
 */

public class P2442 {
    // code beginning
    class Solution {
        public int countDistinctIntegers(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for (int num : nums) {
                seen.add(num);
                StringBuilder ss = new StringBuilder().append(num);
                seen.add(Integer.parseInt(ss.reverse().toString()));
            }
            return seen.size();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2442().new Solution();
        var ans = s.countDistinctIntegers(new int[]{1, 13, 10, 12, 31});
        System.out.println(ans);
    }
}
