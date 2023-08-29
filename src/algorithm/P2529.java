package algorithm;

/**
 * Author: Deean
 * Date: 2023-02-26 11:32
 * FileName: src/leetcode/editor/cn/algorithm
 * Description: 2529. 正整数和负整数的最大计数
 */

public class P2529 {
    // code beginning
    class Solution {
        public int maximumCount(int[] nums) {
            int positive = 0, negative = 0;
            for (int num : nums) {
                if (num > 0) positive++;
                if (num < 0) negative++;
            }
            return Math.max(positive, negative);
        }
    }

    public static void main(String[] args) {
        Solution s = new P2529().new Solution();
        Object ans = s.maximumCount(new int[]{-2, -1, -1, 1, 2, 3});
        System.out.println(ans);
    }
}
