package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-28 22:54
 * FileName: src/main/java/leetcode/algorithm
 * Description:647. 回文子串
 */

public class P0647 {
    // code beginning
    class Solution {
        public int countSubstrings(String s) {
            int cnt = 0;
            for (int i = 0, n = s.length(); i < n * 2 - 1; i++) {
                int left = i / 2, right = i / 2 + i % 2;
                while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                    cnt++;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0647().new Solution();
        var ans = s.countSubstrings("aaa");
        System.out.println(ans);
    }
}
