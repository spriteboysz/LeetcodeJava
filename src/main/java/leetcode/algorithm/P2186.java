package leetcode.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-24 16:50
 * LastEditTime: 2022-07-24 16:50
 * Description: 2186. 使两字符串互为字母异位词的最少步骤数
 */

public class P2186 {
    // code beginning
    class Solution {
        public int minSteps(String s, String t) {
            int[] alphabet = new int[26];
            for (char c : s.toCharArray()) {
                alphabet[c - 'a']++;
            }
            for (char c : t.toCharArray()) {
                alphabet[c - 'a']--;
            }
            // System.out.println(Arrays.toString(alphabet));
            int count = 0;
            for (int i = 0; i < 26; i++) {
                count += Math.abs(alphabet[i]);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P2186().new Solution();
        Object ans = s.minSteps("leetcode", "coats");
        System.out.println(ans);
    }
}