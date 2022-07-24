package leetcode.editor.cn.algorithm;

/**
 * Author: Deean
 * Date: 2022-07-24 16:41
 * LastEditTime: 2022-07-24 16:41
 * Description: 1347. 制造字母异位词的最小步骤数
 */

public class P1347 {
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
                if (alphabet[i] > 0) count += alphabet[i];
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new P1347().new Solution();
        Object ans = s.minSteps("friend", "family");
        System.out.println(ans);
        ans = s.minSteps("leetcode", "practice");
        System.out.println(ans);
    }
}