package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-16 21:07
 * FileName: src/main/java/leetcode/algorithm
 * Description:2839. 判断通过操作能否让字符串相等 I
 */

public class P2839 {
    // code beginning
    class Solution {
        public boolean canBeEqual(String s1, String s2) {
            int[][] cnt = new int[2][26];
            for (int i = 0; i < s1.length(); i++) {
                cnt[i % 2][s1.charAt(i) - 'a']++;
                cnt[i % 2][s2.charAt(i) - 'a']--;
            }
            for (int[] row : cnt) {
                for (int num : row) {
                    if (num != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2839().new Solution();
        var ans = s.canBeEqual("abcd", "cdab");
        System.out.println(ans);
    }
}
