package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-11 22:43
 * FileName: src/leetcode/editor/cn/leetcode.algorithm
 * Description: 1422. 分割字符串的最大得分
 */

public class P1422 {
    // code beginning
    class Solution {
        public int maxScore(String s) {
            int max = 0, count0 = 0, count1 = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') count1++;
            }
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1--;
                }
                max = Math.max(count0 + count1, max);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1422().new Solution();
        Object ans = s.maxScore("00111");
        System.out.println(ans);
    }
}