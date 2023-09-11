package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-06-30 23:15
 * LastEditTime: 2022-06-30 23:15
 * Description: .
 */

public class P1614 {
    // code beginning
    class Solution {
        public int maxDepth(String s) {
            int depth = 0, max = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ('(' == c) {
                    depth++;
                } else if (')' == c) {
                    depth--;
                }
                if (max < depth) max = depth;
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1614().new Solution();
        Object ans = s.maxDepth("(1)+((2))+(((3)))");
        System.out.println(ans);
    }
}