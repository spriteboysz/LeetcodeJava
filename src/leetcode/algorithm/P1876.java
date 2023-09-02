package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-07 23:34
 * LastEditTime: 2022-07-07 23:34
 * Description: 1876. 长度为三且各字符不同的子字符串
 */

public class P1876 {
    // code beginning
    class Solution {
        public int countGoodSubstrings(String s) {
            int count = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                char a = s.charAt(i), b = s.charAt(i + 1), c = s.charAt(i + 2);
                if (a != b && a != c && b != c) count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1876().new Solution();
        Object ans = s.countGoodSubstrings("aababcabc");
        System.out.println(ans);
    }
}