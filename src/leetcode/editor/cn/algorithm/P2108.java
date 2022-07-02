package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-02 22:45
 * LastEditTime: 2022-07-02 22:45
 * Description: 2108. 找出数组中的第一个回文字符串
 */

public class P2108 {
    // code beginning
    class Solution {
        public String firstPalindrome(String[] words) {
            for (String word : words) {
                StringBuilder sb = new StringBuilder(word);
                if (sb.reverse().toString().equals(word)) return word;
            }
            return "";
        }
    }

    public static void main(String[] args) {
        Solution s = new P2108().new Solution();
        Object ans = s.firstPalindrome(new String[]{"notapalindrome", "racecar"});
        System.out.println(ans);
        ans = s.firstPalindrome(new String[]{"abc", "df"});
        System.out.println(ans);
    }
}