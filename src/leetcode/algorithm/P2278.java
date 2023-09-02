package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-01 23:07
 * LastEditTime: 2022-07-01 23:07
 * Description: 2278. 字母在字符串中的百分比
 */

public class P2278 {
    // code beginning
    class Solution {
        public int percentageLetter(String s, char letter) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (letter == s.charAt(i)) count++;
            }
            return count * 100 / s.length();
        }
    }

    public static void main(String[] args) {
        Solution s = new P2278().new Solution();
        Object ans = s.percentageLetter("foobar", 'o');
        System.out.println(ans);
    }
}