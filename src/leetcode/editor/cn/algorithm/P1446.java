package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-08-03 23:31
 * Description: 1446. 连续字符
 */

public class P1446 {
    // code beginning
    class Solution {
        public int maxPower(String s) {
            int max = 0, cur = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    cur++;
                } else {
                    cur = 1;
                }
                max = Math.max(max, cur);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1446().new Solution();
        Object ans = s.maxPower("abbcccddddeeeeedcba");
        System.out.println(ans);
    }
}
