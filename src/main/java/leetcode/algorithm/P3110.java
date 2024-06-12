package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-12 22:17
 * FileName: src/main/java/leetcode/algorithm
 * Description:
 */

public class P3110 {
    // code beginning
    class Solution {
        public int scoreOfString(String s) {
            int score = 0;
            for (int i = 1; i < s.length(); i++) {
                score += Math.abs(s.charAt(i) - s.charAt(i - 1));
            }
            return score;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3110().new Solution();
        var ans = s.scoreOfString("hello");
        System.out.println(ans);
    }
}
