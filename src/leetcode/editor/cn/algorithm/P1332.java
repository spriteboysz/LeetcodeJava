package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-03 18:08
 * LastEditTime: 2022-07-03 18:08
 * Description: 1332. 删除回文子序列
 */

public class P1332 {
    // code beginning
    class Solution {
        public int removePalindromeSub(String s) {
            int n = s.length();
            for (int i = 0; i < n / 2; ++i) {
                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1332().new Solution();
        Object ans = s.removePalindromeSub("abb");
        System.out.println(ans);
    }
}