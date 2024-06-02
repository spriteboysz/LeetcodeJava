package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2024-06-02 10:35
 * FileName: src/main/java/leetcode/algorithm
 * Description: 3146. 两个字符串的排列差
 */

public class P3146 {
    // code beginning
    class Solution {
        public int findPermutationDifference(String s, String t) {
            int[] alphabet = new int[26];
            for (int i = 0; i < s.length(); i++) {
                alphabet[s.charAt(i) - 'a'] += i;
                alphabet[t.charAt(i) - 'a'] -= i;
            }
            int diff = 0;
            for (int num : alphabet) {
                diff += Math.abs(num);
            }
            return diff;
        }
    }

    public static void main(String[] args) {
        Solution s = new P3146().new Solution();
        var ans = s.findPermutationDifference("abcde", "edbac");
        System.out.println(ans);
    }
}
