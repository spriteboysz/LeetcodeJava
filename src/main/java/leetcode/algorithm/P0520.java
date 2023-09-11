package leetcode.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-23 23:58
 * LastEditTime: 2022-06-23 23:58
 * Description: 检测大写字母
 */

public class P0520 {
    // code beginning
    class Solution {
        public boolean detectCapitalUse(String word) {
            int n = word.length(), count = 0;
            for (int i = 0; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i))) count++;
            }
            return count == n || count == 0 || (count == 1 && Character.isUpperCase(word.charAt(0)));
        }
    }

    public static void main(String[] args) {
        Solution s = new P0520().new Solution();
        Object ans = s.detectCapitalUse("uSA");
        System.out.println(ans);
        ans = s.detectCapitalUse("leetcode");
        System.out.println(ans);
        ans = s.detectCapitalUse("LeetcoDe");
        System.out.println(ans);
    }
}