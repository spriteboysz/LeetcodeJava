package algorithm;

/**
 * Author: @Deean
 * Date: 2022-06-22 23:39
 * LastEditTime: 2022-06-22 23:39
 * Description: 赎金信
 */

public class P0383 {
    // code beginning
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] rChars = new int[26];
            int[] mChars = new int[26];
            for (int i = 0; i < ransomNote.length(); i++) {
                rChars[ransomNote.charAt(i) - 97] += 1;
            }
            for (int i = 0; i < magazine.length(); i++) {
                mChars[magazine.charAt(i) - 97] += 1;
            }
            for (int i = 0; i < 26; i++) {
                if (mChars[i] - rChars[i] < 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new P0383().new Solution();
        Object ans = s.canConstruct("aa", "aab");
        System.out.println(ans);
    }
}