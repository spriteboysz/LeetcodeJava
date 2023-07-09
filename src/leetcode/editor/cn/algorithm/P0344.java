package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-24 21:17
 * LastEditTime: 2022-06-24 21:17
 * Description: 反转字符串
 */

public class P0344 {
    // code beginning
    class Solution {
        public void reverseString(char[] s) {
            int n = s.length;
            for (int left = 0, right = n - 1; left < right; left++, right--) {
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new P0344().new Solution();
        s.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
        s.reverseString(new char[]{'h', 'e', 'l', 'o'});
    }
}