package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-06 22:04
 * FileName: src/leetcode/algorithm
 * Description:2609. 最长平衡子字符串
 */

public class P2609 {
    // code beginning
    class Solution {
        public int findTheLongestBalancedSubstring(String s) {
            for (int i = 25; i >= 0; i--) {
                StringBuilder ss = new StringBuilder();
                ss.append("0".repeat(i));
                ss.append("1".repeat(i));
                if (s.contains(ss.toString())) {
                    return i * 2;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2609().new Solution();
        Object ans = s.findTheLongestBalancedSubstring("01000111");
        System.out.println(ans);
    }
}
