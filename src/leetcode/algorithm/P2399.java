package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2023-09-08 23:15
 * FileName: src/leetcode/algorithm
 * Description:2399. 检查相同字母间的距离
 */

public class P2399 {
    // code beginning
    class Solution {
        public boolean checkDistances(String s, int[] distance) {
            for (int i = 0, n = s.length(); i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j) && distance[s.charAt(i) - 'a'] != j - i - 1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2399().new Solution();
        var ans = s.checkDistances("abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        System.out.println(ans);
    }
}
