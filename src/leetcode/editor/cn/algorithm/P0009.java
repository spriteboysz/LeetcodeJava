package leetcode.editor.cn.algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-21 23:58
 * LastEditTime: 2022-06-21 23:58
 * Description:
 */

public class P0009 {
    // code beginning
    class Solution {
        public boolean isPalindrome(int x) {
            String reversedStr = (new StringBuilder(x + "")).reverse().toString();
            return (x + "").equals(reversedStr);
        }
    }

    public static void main(String[] args) {
        Solution solution = new P0009().new Solution();
        boolean ans = solution.isPalindrome(121);
        System.out.println(ans);
    }
}